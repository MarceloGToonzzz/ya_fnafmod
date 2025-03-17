package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.YaFnafmodMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PhantomJumpscareProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double invisible_time = 0;
		double effect = 0;
		if (sourceentity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:phantoms")))) {
			if (world instanceof Level)
				((Level) world).playSound(null, BlockPos.containing(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:jumpscare_fnaf3")), SoundSource.HOSTILE, 1, 1);
			effect = Mth.nextInt(RandomSource.create(), 1, 3);
			if (effect == 1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 1, false, false));
			} else if (effect == 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 1, false, false));
			} else if (effect == 3) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 1, false, false));
			}
			invisible_time = Mth.nextInt(RandomSource.create(), 5, 20);
			{
				Entity _ent = sourceentity;
				_ent.teleportTo((sourceentity.getPersistentData().getDouble("x")), (sourceentity.getPersistentData().getDouble("y")), (sourceentity.getPersistentData().getDouble("z")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((sourceentity.getPersistentData().getDouble("x")), (sourceentity.getPersistentData().getDouble("y")), (sourceentity.getPersistentData().getDouble("z")), _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof Mob _mob) {
				_mob.setNoAi(true);
			}
			sourceentity.getPersistentData().putBoolean("just_jumpscared", true);
			YaFnafmodMod.queueServerWork((int) (invisible_time * 20), () -> {
				sourceentity.getPersistentData().putBoolean("just_jumpscared", false);
				if (sourceentity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.INVISIBILITY);
				if (entity instanceof Mob _mob) {
					_mob.setNoAi(false);
				}
			});
		}
	}
}
