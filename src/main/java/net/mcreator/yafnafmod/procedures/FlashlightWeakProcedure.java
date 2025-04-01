package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.NightmareFreddyEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.LolbitEntity;
import net.mcreator.yafnafmod.entity.JJEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class FlashlightWeakProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof BalloonBoyEntity || entityiterator instanceof JJEntity) && !(entity == entityiterator)) {
					if ((entityiterator instanceof BalloonBoyEntity _datEntL3 && _datEntL3.getEntityData().get(BalloonBoyEntity.DATA_laughing)) == true
							|| (entityiterator instanceof JJEntity _datEntL4 && _datEntL4.getEntityData().get(JJEntity.DATA_laughing)) == true) {
						if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity)) {
							if (new Vec3(x, y, z).distanceTo(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))) < 4) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1.5);
							}
						}
					}
				}
				if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FLASHLIGHT.get()
						&& (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("damaged")
						|| (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FLASHLIGHT.get()
								&& (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getBoolean("damaged")) {
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:flashlight_weak"))) && !(entity instanceof NightmareFreddyEntity)) {
						if (IsEntityBeingLookedAtProcedure.execute(world, entity, entityiterator, entity.getEyeHeight()) == true) {
							if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:flashlight_weak"))) && !(entity instanceof NightmareFreddyEntity) && !(entity instanceof PlushtrapEntity)
									&& !(entity instanceof NightmareBbEntity) && !(entity instanceof FuntimeFoxyEntity) && !(entity instanceof LolbitEntity)) {
								if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("phantom")) {
									{
										Entity _ent = entity;
										_ent.teleportTo((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")));
										if (_ent instanceof ServerPlayer _serverPlayer)
											_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")), _ent.getYRot(), _ent.getXRot());
									}
									if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
										_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 5, 1, false, false));
								}
								if (entity instanceof Mob _entity)
									_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")), 1.25);
							} else if (entity instanceof PlushtrapEntity || entity instanceof NightmareBbEntity) {
								if (entity instanceof PlushtrapEntity _datEntSetL)
									_datEntSetL.getEntityData().set(PlushtrapEntity.DATA_sitting, true);
								if (entity instanceof NightmareBbEntity _datEntSetL)
									_datEntSetL.getEntityData().set(NightmareBbEntity.DATA_sitting, true);
								if ((entity instanceof PlushtrapEntity _datEntL46 && _datEntL46.getEntityData().get(PlushtrapEntity.DATA_sitting)) == true
										|| (entity instanceof NightmareBbEntity _datEntL47 && _datEntL47.getEntityData().get(NightmareBbEntity.DATA_sitting)) == true) {
									if (entity instanceof PlushtrapEntity) {
										((PlushtrapEntity) entity).setAnimation("animation.plush.sit");
									}
									if (entity instanceof NightmareBbEntity) {
										((NightmareBbEntity) entity).setAnimation("animation.bb.sit");
									}
									if (entity instanceof Mob _mobSetNoAi) {
										_mobSetNoAi.setNoAi(true);
									}
								} else {
									if (entity instanceof PlushtrapEntity) {
										((PlushtrapEntity) entity).setAnimation("empty");
									}
									if (entity instanceof NightmareBbEntity) {
										((NightmareBbEntity) entity).setAnimation("empty");
									}
									if (entity instanceof Mob _mobSetNoAi) {
										_mobSetNoAi.setNoAi(false);
									}
								}
							} else if (entity instanceof FuntimeFoxyEntity || entity instanceof LolbitEntity) {
								if (entity instanceof Mob _entity)
									_entity.getNavigation().stop();
							}
						}
					} else {
						if (IsEntityBeingLookedAtProcedure.execute(world, entity, entityiterator, 0.625) == true) {
							if ((entity instanceof NightmareFreddyEntity _datEntI ? _datEntI.getEntityData().get(NightmareFreddyEntity.DATA_freddles) : 0) != 4) {
								if (entity instanceof NightmareFreddyEntity _datEntSetI)
									_datEntSetI.getEntityData().set(NightmareFreddyEntity.DATA_freddles, 0);
							}
						}
					}
				} else {
					if (entity instanceof PlushtrapEntity || entity instanceof NightmareBbEntity) {
						if ((entity instanceof PlushtrapEntity _datEntL61 && _datEntL61.getEntityData().get(PlushtrapEntity.DATA_sitting)) == true
								|| (entity instanceof NightmareBbEntity _datEntL62 && _datEntL62.getEntityData().get(NightmareBbEntity.DATA_sitting)) == true) {
							if (entity instanceof PlushtrapEntity _datEntSetL)
								_datEntSetL.getEntityData().set(PlushtrapEntity.DATA_sitting, false);
							if (entity instanceof NightmareBbEntity _datEntSetL)
								_datEntSetL.getEntityData().set(NightmareBbEntity.DATA_sitting, false);
						}
					}
				}
			}
		}
	}
}
