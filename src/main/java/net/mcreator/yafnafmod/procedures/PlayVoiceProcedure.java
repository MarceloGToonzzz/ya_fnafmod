package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.GusThePugEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeDelilahEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.BarryPolarEntity;

public class PlayVoiceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double chance = 0;
		if (world.getLevelData().getGameRules().getBoolean(YaFnafmodModGameRules.ENABLE_VOICES) == true) {
			PlayAttackVoiceProcedure.execute(world, x, y, z, entity);
			if (entity.getPersistentData().getBoolean("set_max") == false) {
				entity.getPersistentData().putDouble("voice_max", (Mth.nextInt(RandomSource.create(), 1500, 6000)));
				entity.getPersistentData().putBoolean("set_max", true);
			}
			if (entity.getPersistentData().getDouble("voice_tick") > entity.getPersistentData().getDouble("voice_max")) {
				if (entity instanceof FoxyPirateEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_foxy_singing")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof WitheredChicaEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_wchica_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof ToyFreddyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_tfreddy_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof SpringtrapEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_springtrap_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof NightmareFredbearEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_nfredbear_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof FuntimeFreddyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_ftfreddy_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof MoltenFreddyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_moltenfreddy_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof ScraptrapEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scraptrap_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof ScrapBabyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scrapbaby_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof LeftyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_lefty_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof NeddbearEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_neddbear_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof RockstarBonnieEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_rockbonnie_voice")), SoundSource.HOSTILE, 1, 1);
				}
				if (entity instanceof BarryPolarEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_bpolar_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof GusThePugEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_guspug_voice")), SoundSource.HOSTILE, 1, 1);
				} else if (entity instanceof FuntimeDelilahEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_ftdelilah_voice")), SoundSource.HOSTILE, 1, 1);
				}
				entity.getPersistentData().putDouble("voice_tick", 0);
				entity.getPersistentData().putBoolean("set_max", false);
			}
			entity.getPersistentData().putDouble("voice_tick", (entity.getPersistentData().getDouble("voice_tick") + 1));
		}
	}
}
