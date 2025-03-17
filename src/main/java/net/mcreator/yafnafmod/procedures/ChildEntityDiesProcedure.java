package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.entity.ChildEntity;

public class ChildEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double chance = 0;
		String gfdasgasdg = "";
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
					if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
						gfdasgasdg = "summon ya_fnafmod:ghost_child ~ ~ ~ {ForgeData: {killer: \"MEME\",type: \"vengeful\"}}".replace("MEME", sourceentity.getStringUUID());
					} else {
						gfdasgasdg = "summon ya_fnafmod:ghost_child ~ ~ ~ {ForgeData: {type: \"normal\"}}";
					}
				} else {
					if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
						gfdasgasdg = "summon ya_fnafmod:ghost_child ~ ~ ~ {ForgeData: {type: \"normal\"}}";
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), gfdasgasdg);
			}
		}
	}
}
