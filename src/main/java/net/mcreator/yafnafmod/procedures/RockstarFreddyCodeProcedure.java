package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.entity.RockstarFreddyEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class RockstarFreddyCodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof RockstarFreddyEntity) {
			entity.getPersistentData().putDouble("rockfred_tick", (entity.getPersistentData().getDouble("rockfred_tick") + 1));
			if (entity.getPersistentData().getDouble("rockfred_tick") > Mth.nextInt(RandomSource.create(), 54, 22)) {
				YaFnafmodMod.LOGGER.info("woah");
				if (world.getDifficulty() == Difficulty.EASY && Mth.nextInt(RandomSource.create(), 1, 20) < 2 || world.getDifficulty() == Difficulty.NORMAL && Mth.nextInt(RandomSource.create(), 1, 20) < 5
						|| world.getDifficulty() == Difficulty.HARD && Mth.nextInt(RandomSource.create(), 1, 20) < 10) {
					YaFnafmodMod.LOGGER.info("yay");
					if (entity.getPersistentData().getDouble("state") == 0) {
						if (entity.getPersistentData().getDouble("rockfred_tick") > Mth.nextInt(RandomSource.create(), 122, 154)) {
							entity.getPersistentData().putDouble("state", 1);
							entity.getPersistentData().putDouble("rockfred_tick", 0);
							entity.getPersistentData().putDouble("voice_tick", 80);
						}
					} else if (entity.getPersistentData().getDouble("state") == 1) {
						if (entity.getPersistentData().getDouble("rockfred_tick") > Mth.nextInt(RandomSource.create(), 92, 124)) {
							entity.getPersistentData().putDouble("state", 2);
							entity.getPersistentData().putDouble("rockfred_tick", 0);
							entity.getPersistentData().putDouble("voice_tick", 80);
						}
					} else if (entity.getPersistentData().getDouble("state") == 2) {
						if (entity.getPersistentData().getDouble("rockfred_tick") > Mth.nextInt(RandomSource.create(), 72, 104)) {
							entity.getPersistentData().putDouble("state", 3);
							entity.getPersistentData().putDouble("rockfred_tick", 0);
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("state") == 0 || entity.getPersistentData().getDouble("state") == 1 || entity.getPersistentData().getDouble("state") == 2 || entity.getPersistentData().getDouble("state") == 3) {
				if (entity.getPersistentData().getDouble("state") == 0) {
					if (entity instanceof RockstarFreddyEntity) {
						((RockstarFreddyEntity) entity).setAnimation("animation.freddy.deactivated");
					}
					if (entity instanceof Mob _mob) {
						_mob.setNoAi(true);
					}
				} else if (entity.getPersistentData().getDouble("state") == 1) {
					if (entity instanceof RockstarFreddyEntity) {
						((RockstarFreddyEntity) entity).setAnimation("animation.freddy.pls_deposit");
					}
					if (entity instanceof Mob _mob) {
						_mob.setNoAi(true);
					}
				} else if (entity.getPersistentData().getDouble("state") == 2) {
					if (entity instanceof RockstarFreddyEntity) {
						((RockstarFreddyEntity) entity).setAnimation("animation.freddy.mad");
					}
					if (entity instanceof Mob _mob) {
						_mob.setNoAi(true);
					}
				} else if (entity.getPersistentData().getDouble("state") == 3) {
					if (entity instanceof RockstarFreddyEntity) {
						((RockstarFreddyEntity) entity).setAnimation("empty");
					}
					if (entity instanceof Mob _mob) {
						_mob.setNoAi(false);
					}
				}
				if (entity.getPersistentData().getDouble("state") == 1 || entity.getPersistentData().getDouble("state") == 2) {
					entity.getPersistentData().putDouble("voice_tick", (entity.getPersistentData().getDouble("voice_tick") + 1));
					if (entity.getPersistentData().getDouble("voice_tick") > 80) {
						entity.getPersistentData().putDouble("voice_tick", 0);
						if (entity.getPersistentData().getDouble("state") == 1) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_rfreddy_plsdeposit")), SoundSource.HOSTILE, 1, 1);
						} else if (entity.getPersistentData().getDouble("state") == 2) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_rfreddy_trickvoice")), SoundSource.HOSTILE, 1, 1);
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("coin") > 4) {
				entity.getPersistentData().putDouble("voice_tick", 0);
				entity.getPersistentData().putDouble("rockfred_tick", 0);
				entity.getPersistentData().putDouble("state", 0);
				entity.getPersistentData().putDouble("coin", 0);
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_rfreddy_thankyou")), SoundSource.HOSTILE, 1, 1);
			}
		}
	}
}
