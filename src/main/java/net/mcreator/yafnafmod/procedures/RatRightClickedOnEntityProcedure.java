package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.entity.RatEntity;

public class RatRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack wa = ItemStack.EMPTY;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
				wa = new ItemStack(YaFnafmodModItems.RAT_ITEM.get()).copy();
				if (!(entity.getDisplayName().getString()).equals(entity.getType().getDescription().getString())) {
					wa.getOrCreateTag().putBoolean("has_name", true);
					wa.getOrCreateTag().putString("rat_name", (entity.getDisplayName().getString()));
					wa.getOrCreateTag().putDouble("skin", (entity instanceof RatEntity _datEntI ? _datEntI.getEntityData().get(RatEntity.DATA_skin) : 0));
					if ((entity.getDisplayName().getString()).contains("[") && (entity.getDisplayName().getString()).contains("]")) {
						wa.setHoverName(Component.literal(((entity.getDisplayName().getString()).substring((int) (entity.getDisplayName().getString()).indexOf("[") + "[".length(), (int) (entity.getDisplayName().getString()).lastIndexOf("]")))));
					} else {
						wa.setHoverName(Component.literal((entity.getDisplayName().getString())));
					}
				}
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = wa.copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
