package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModGameRules;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateEntity;

public class PlayAttackVoiceSimpleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(YaFnafmodModGameRules.ENABLE_VOICES) == true) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
				if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:mask_foolers"))) || entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:mask_foolers")))
						&& !(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getItem() == YaFnafmodModItems.FREDDY_MASK_HELMET.get())) {
					if (entity.getPersistentData().getBoolean("said_attack_line") == false) {
						if (entity instanceof FoxyPirateEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_foxy_voice")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof ToyFreddyEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_tfreddy_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof WitheredChicaEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anim_wchica_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof SpringtrapEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_springtrap_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof NightmareFredbearEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_nfredbear_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof FuntimeFreddyEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_ftfreddy_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof MoltenFreddyEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_moltenfreddy_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof ScraptrapEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scraptrap_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						} else if (entity instanceof ScrapBabyEntity) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_scrapbaby_voice_hostile")), SoundSource.HOSTILE, 1, 1);
						}
					}
					entity.getPersistentData().putBoolean("set_max", false);
					entity.getPersistentData().putBoolean("said_attack_line", true);
					entity.getPersistentData().putDouble("voice_tick", 0);
				}
			} else {
				entity.getPersistentData().putBoolean("said_attack_line", false);
			}
		}
	}
}
