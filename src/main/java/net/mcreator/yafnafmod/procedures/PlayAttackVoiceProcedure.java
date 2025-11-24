package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.entity.YellowRabbitEntity;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.WitheredBarryPolarEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieEntity;
import net.mcreator.yafnafmod.entity.PitbonnieEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.GusThePugEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.BarryPolarEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class PlayAttackVoiceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(YaFnafmodModGameRules.ENABLE_VOICES) == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (!(entity == null)) {
					if (40 > entity.getPersistentData().getDouble("attackvoice_tick")) {
						if (entity.getPersistentData().getBoolean("said_attack_line") == false) {
							if (entity instanceof FoxyPirateEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_foxy_voice")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof ToyFreddyEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_tfreddy_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof WitheredChicaEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_wchica_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof SpringtrapEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_springtrap_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof NightmareFredbearEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_nfredbear_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof FuntimeFreddyEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_ftfreddy_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof MoltenFreddyEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_moltenfreddy_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof ScraptrapEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scraptrap_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof ScrapBabyEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scrapbaby_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof LeftyEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_lefty_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof NeddbearEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_neddbear_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof RockstarBonnieEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_rockbonnie_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof YellowRabbitEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_yellowrabbit_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof BarryPolarEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_bpolar_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof GusThePugEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_guspug_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							} else if (entity instanceof WitheredBarryPolarEntity) {
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_wbpolar_voice_hostile")), SoundSource.HOSTILE, 1, 1);
							}
							if (entity instanceof PitbonnieEntity) {
								entity.getPersistentData().putBoolean("aggro_anim", true);
								if (entity instanceof PitbonnieEntity) {
									((PitbonnieEntity) entity).setAnimation("animation.pitbonnie.alert");
								}
								if (world instanceof Level)
									((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_pitbonnie_scream")), SoundSource.HOSTILE, 1, 1);
								YaFnafmodMod.queueServerWork(45, () -> {
									entity.getPersistentData().putBoolean("aggro_anim", false);
									if (entity instanceof PitbonnieEntity) {
										((PitbonnieEntity) entity).setAnimation("empty");
									}
								});
							}
							entity.getPersistentData().putDouble("attackvoice_tick", 0);
							entity.getPersistentData().putBoolean("said_attack_line", true);
						}
						if (entity.getPersistentData().getBoolean("aggro_anim") == true) {
							if (entity instanceof Mob _entity)
								_entity.getNavigation().stop();
						}
						entity.getPersistentData().putBoolean("set_max", false);
						entity.getPersistentData().putDouble("voice_tick", (entity.getPersistentData().getDouble("attackvoice_tick") + 1));
					}
				}
			} else {
				entity.getPersistentData().putDouble("attackvoice_tick", 0);
				entity.getPersistentData().putBoolean("said_attack_line", false);
				entity.getPersistentData().putBoolean("aggro_anim", false);
			}
		}
	}
}
