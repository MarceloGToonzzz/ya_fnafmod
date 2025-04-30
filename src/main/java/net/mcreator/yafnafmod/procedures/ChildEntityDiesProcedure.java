package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.entity.ChildEntity;

public class ChildEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double chance = 0;
		String gfdasgasdg = "";
		String killeruuid = "";
		String type = "";
		if (entity instanceof ChildEntity) {
			chance = Mth.nextInt(RandomSource.create(), 1, 3);
			if (chance == 1) {
				if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("happy")) {
					for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 6); index0++) {
						if (!(Mth.nextInt(RandomSource.create(), 1, 5) == 1)) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.REMNANT.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.AGONY.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("sad")) {
					for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 6); index1++) {
						if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.REMNANT.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.AGONY.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				} else if ((entity instanceof ChildEntity _datEntS ? _datEntS.getEntityData().get(ChildEntity.DATA_emotion) : "").equals("angry")) {
					for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 6); index2++) {
						if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.REMNANT.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.AGONY.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			} else if (chance == 2) {
				if (sourceentity instanceof LivingEntity) {
					killeruuid = sourceentity.getStringUUID();
					if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
						type = "vengeful";
					} else {
						type = "normal";
					}
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
						type = "normal";
					}
				}
				if (world instanceof ServerLevel _serverLevel) {
					Entity entityinstance = YaFnafmodModEntities.GHOST_CHILD.get().create(_serverLevel, null, null, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED, false, false);
					if (entityinstance != null) {
						entityinstance.setYRot(world.getRandom().nextFloat() * 360.0F);
						entityinstance.getPersistentData().putString("type", type);
						entityinstance.getPersistentData().putString("killer", killeruuid);
						entityinstance.setCustomName(Component.literal((entity.getDisplayName().getString())));
						_serverLevel.addFreshEntity(entityinstance);
					}
				}
			}
		}
	}
}
