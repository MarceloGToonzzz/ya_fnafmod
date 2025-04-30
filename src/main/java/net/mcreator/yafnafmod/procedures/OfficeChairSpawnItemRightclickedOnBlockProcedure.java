package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModEntities;

public class OfficeChairSpawnItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (itemstack.getItem() == YaFnafmodModItems.OFFICE_CHAIR_RED_SPAWN_ITEM.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = YaFnafmodModEntities.OFFICE_CHAIR_RED_ENTITY.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (itemstack.getItem() == YaFnafmodModItems.OFFICE_CHAIR_BLACK_SPAWN_ITEM.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = YaFnafmodModEntities.OFFICE_CHAIR_BLACK_ENTITY.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
