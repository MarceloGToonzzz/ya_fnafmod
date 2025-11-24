package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.entity.RatEntity;

public class RatItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack wa = ItemStack.EMPTY;
		if (world instanceof ServerLevel _serverLevel) {
			Entity entityinstance = YaFnafmodModEntities.RAT.get().create(_serverLevel, null, null, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED, false, false);
			if (entityinstance != null) {
				entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
				if (entity instanceof RatEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RatEntity.DATA_setSkin, true);
				if ((itemstack.getDisplayName().getString()).equals("chuck")) {
					itemstack.getOrCreateTag().putDouble("skin", 3);
				} else if ((itemstack.getDisplayName().getString()).equals("burger")) {
					itemstack.getOrCreateTag().putDouble("skin", 4);
				} else if ((itemstack.getDisplayName().getString()).equals("rizz")) {
					itemstack.getOrCreateTag().putDouble("skin", 5);
				} else if ((itemstack.getDisplayName().getString()).equals("stupid")) {
					itemstack.getOrCreateTag().putDouble("skin", 6);
				} else if ((itemstack.getDisplayName().getString()).equals("rapper")) {
					itemstack.getOrCreateTag().putDouble("skin", 7);
				} else if ((itemstack.getDisplayName().getString()).equals("midas")) {
					itemstack.getOrCreateTag().putDouble("skin", 8);
				} else if ((itemstack.getDisplayName().getString()).equals("pipe")) {
					itemstack.getOrCreateTag().putDouble("skin", 9);
				}
				if (entityinstance instanceof RatEntity _datEntSetI)
					_datEntSetI.getEntityData().set(RatEntity.DATA_skin, (int) itemstack.getOrCreateTag().getDouble("skin"));
				RatOnInitialEntitySpawnProcedure.execute(entityinstance);
				if (entityinstance instanceof TamableAnimal _toTame && entity instanceof Player _owner)
					_toTame.tame(_owner);
				if (itemstack.getOrCreateTag().getBoolean("has_name") == true) {
					if ((itemstack.getDisplayName().getString()).contains("[") && (itemstack.getDisplayName().getString()).contains("]")) {
						entityinstance.setCustomName(
								Component.literal(((itemstack.getDisplayName().getString()).substring((int) (itemstack.getDisplayName().getString()).indexOf("[") + "[".length(), (int) (itemstack.getDisplayName().getString()).lastIndexOf("]")))));
					} else {
						entityinstance.setCustomName(Component.literal((itemstack.getDisplayName().getString())));
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				_serverLevel.addFreshEntity(entityinstance);
			}
		}
	}
}
