package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.MinireenaEntity;
import net.mcreator.yafnafmod.entity.Minireena2Entity;
import net.mcreator.yafnafmod.entity.IndigoEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FuntimeDelilahEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;
import net.mcreator.yafnafmod.entity.EnnardEntity;
import net.mcreator.yafnafmod.entity.ElectrobabEntity;
import net.mcreator.yafnafmod.entity.DrTeethEntity;
import net.mcreator.yafnafmod.entity.BidybabEntity;
import net.mcreator.yafnafmod.entity.BarryPolarEntity;
import net.mcreator.yafnafmod.entity.BalloraEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DeathVoiceProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		execute(null, world, x, y, z, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
		if (sourceentity == null)
			return;
		double delay = 0;
		if (world.getLevelData().getGameRules().getBoolean(YaFnafmodModGameRules.ENABLE_JUMPSCARES) == true) {
			if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf1_jumpscare")))) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf1")), SoundSource.HOSTILE, 1, 1);
				delay = 100;
			} else if (sourceentity instanceof GoldenFreddyEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf1_gfreddy")), SoundSource.HOSTILE, 1, 1);
				delay = 300;
			} else if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf2_jumpscare")))) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf2")), SoundSource.HOSTILE, 1, 1);
				delay = 30;
			} else if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf3_jumpscare")))) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf3")), SoundSource.HOSTILE, 1, 1);
				delay = 40;
			} else if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf4_jumpscare")))) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf4")), SoundSource.HOSTILE, 1, 1);
				delay = 48;
			} else if (sourceentity instanceof NightmareEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf4_nightmare")), SoundSource.HOSTILE, 1, 1);
				delay = 52;
			} else if (sourceentity instanceof FuntimeFreddyEntity || sourceentity instanceof BarryPolarEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnafsl_ffreddy")), SoundSource.HOSTILE, 1, 1);
				delay = 54;
			} else if (sourceentity instanceof FuntimeFoxyEntity || sourceentity instanceof IndigoEntity || sourceentity instanceof FuntimeDelilahEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnafsl_ffoxy")), SoundSource.HOSTILE, 1, 1);
				delay = 86;
			} else if (sourceentity instanceof EnnardEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnafsl_ennard")), SoundSource.HOSTILE, 1, 1);
				delay = 64;
			} else if (sourceentity instanceof BalloraEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnafsl_ballora")), SoundSource.HOSTILE, 1, 1);
				delay = 46;
			} else if (sourceentity instanceof MinireenaEntity || sourceentity instanceof Minireena2Entity || sourceentity instanceof BidybabEntity || sourceentity instanceof ElectrobabEntity || sourceentity instanceof DrTeethEntity) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnafsl_mini")), SoundSource.HOSTILE, 1, 1);
				delay = 60;
			} else if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:fnaf6_jumpscare")))) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf6")), SoundSource.HOSTILE, 1, 1);
				delay = 80;
			}
		} else {
			delay = 0;
		}
		YaFnafmodMod.queueServerWork((int) delay, () -> {
			if (world.getLevelData().getGameRules().getBoolean(YaFnafmodModGameRules.ENABLE_VOICES) == true) {
				if (sourceentity instanceof FoxyPirateEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_foxy_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof ToyFreddyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_toyfreddy_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof WitheredChicaEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_wchica_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof SpringtrapEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_springtrap_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof NightmareFredbearEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_nfredbear_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof FuntimeFreddyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_ftfreddy_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof MoltenFreddyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_moltenfreddy_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof ScraptrapEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scraptrap_killvoice")), SoundSource.HOSTILE, 1, 1);
				} else if (sourceentity instanceof ScrapBabyEntity) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scrapbaby_killvoice")), SoundSource.HOSTILE, 1, 1);
				}
			}
		});
	}
}
