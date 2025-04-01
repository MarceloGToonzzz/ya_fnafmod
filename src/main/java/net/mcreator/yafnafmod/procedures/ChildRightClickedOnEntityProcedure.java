package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.entity.ChildEntity;

public class ChildRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack item = ItemStack.EMPTY;
		boolean success = false;
		item = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).copy();
		if (item.getItem() == YaFnafmodModItems.PIZZA_SLICE.get() || item.getItem() == YaFnafmodModItems.PIZZA_SLICE_FRESH.get() || item.getItem() == Items.CAKE || item.getItem() == YaFnafmodModItems.MILKSHAKE_CHOCOLATE.get()
				|| item.getItem() == YaFnafmodModItems.MILKSHAKE_CHERRY.get() || item.getItem() == YaFnafmodModItems.MILKSHAKE_STRAWBERRY.get()) {
			if (!(sourceentity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = item;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
			success = true;
		}
		if (success == true) {
			if (entity instanceof ChildEntity _datEntSetS)
				_datEntSetS.getEntityData().set(ChildEntity.DATA_emotion, "happy");
			entity.getPersistentData().putDouble("emotion_tick", 0);
		}
	}
}
