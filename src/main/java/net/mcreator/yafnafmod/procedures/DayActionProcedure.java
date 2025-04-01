package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.entity.WitheredGoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PanStanEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.GusThePugEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;
import net.mcreator.yafnafmod.entity.FredbearEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;
import net.mcreator.yafnafmod.entity.BaggieMaggieEntity;
import net.mcreator.yafnafmod.entity.BaggieMaggieDayEntity;

import java.util.List;
import java.util.Comparator;

public class DayActionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		double yaw = 0;
		String thing = "";
		String command = "";
		String ai = "";
		String entity_name = "";
		if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:dayinvisible"))) && !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:nightdisappear")))
				&& !entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:no_daymode")))) {
			if ((GetWorldTimeProcedure.execute(world)) > (23829) && (GetWorldTimeProcedure.execute(world)) < (24000)) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")), 1);
			}
			if (IsItNighttimeProcedure.execute(world) == false) {
				{
					Entity _ent = entity;
					_ent.setYRot((float) entity.getPersistentData().getDouble("yaw"));
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level().getServer(), _ent),
								("tp " + entity.getPersistentData().getDouble("x") + " " + entity.getPersistentData().getDouble("y") + " " + entity.getPersistentData().getDouble("z") + " " + entity.getPersistentData().getDouble("yaw") + " 0"));
					}
				}
				yaw = entity.getPersistentData().getDouble("yaw");
				entity_name = ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString() + "_day";
				if (entity instanceof ToyFreddyEntity && (entity instanceof ToyFreddyEntity _datEntL18 && _datEntL18.getEntityData().get(ToyFreddyEntity.DATA_unmoving)) == false
						|| entity instanceof ToyBonnieEntity && (entity instanceof ToyBonnieEntity _datEntL20 && _datEntL20.getEntityData().get(ToyBonnieEntity.DATA_unmoving)) == false
						|| entity instanceof ToyChicaEntity && (entity instanceof ToyChicaEntity _datEntL22 && _datEntL22.getEntityData().get(ToyChicaEntity.DATA_unmoving)) == false
						|| entity instanceof ToyFoxyEntity && (entity instanceof ToyFoxyEntity _datEntL24 && _datEntL24.getEntityData().get(ToyFoxyEntity.DATA_unmoving)) == false
						|| entity instanceof GusThePugEntity && (entity instanceof GusThePugEntity _datEntL26 && _datEntL26.getEntityData().get(GusThePugEntity.DATA_unmoving)) == false) {
					ai = "0";
				} else {
					ai = "1";
					if (entity instanceof ToyFreddyEntity && (entity instanceof ToyFreddyEntity _datEntL28 && _datEntL28.getEntityData().get(ToyFreddyEntity.DATA_unmoving)) == true
							|| entity instanceof ToyBonnieEntity && (entity instanceof ToyBonnieEntity _datEntL30 && _datEntL30.getEntityData().get(ToyBonnieEntity.DATA_unmoving)) == true
							|| entity instanceof ToyChicaEntity && (entity instanceof ToyChicaEntity _datEntL32 && _datEntL32.getEntityData().get(ToyChicaEntity.DATA_unmoving)) == true
							|| entity instanceof ToyFoxyEntity && (entity instanceof ToyFoxyEntity _datEntL34 && _datEntL34.getEntityData().get(ToyFoxyEntity.DATA_unmoving)) == true
							|| entity instanceof GusThePugEntity && (entity instanceof GusThePugEntity _datEntL36 && _datEntL36.getEntityData().get(GusThePugEntity.DATA_unmoving)) == true) {
						entity_name = ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString() + "_still_day";
					}
				}
				thing = ((((((((((("summon ENTITY_REGISTRY ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {controlshock_linked:1b, GotCordinates: 1b, x: XPOS, y: YPOS, style: \"STYLISTIC\", skin: \"SKINS\", z: ZPOS, yaw: YAW,controlshock_x:XSHOCK,controlshock_y:YSHOCK,controlshock_z:ZSHOCK}, Attributes: [{Base: 0.2d, Name: \"minecraft:generic.movement_speed\"}], Invulnerable: 0b, FallDistance: 0.0f, CanUpdate: 1b, DeathTime: 0s, NoAI: MOVEEEb, Rotation: [ZEDAWf, 0.0f], HandItems: [{}, {}], ArmorDropChances: [0.085f, 0.085f, 0.085f, 0.085f], Fire: 0s, ArmorItems: [{}, {}, {}, {}], CanPickUpLoot: 0b, HurtTime: 0s}"
						.replace("ZSHOCK", "" + entity.getPersistentData().getDouble("controlshock_z"))).replace("YSHOCK", "" + entity.getPersistentData().getDouble("controlshock_y")))
						.replace("XSHOCK", "" + entity.getPersistentData().getDouble("controlshock_x"))).replace("ENTITY_REGISTRY", entity_name)).replace("MOVEEE", ai)).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
						.replace("ZEDAW", "" + entity.getPersistentData().getDouble("yaw"))).replace("SKINS", entity.getPersistentData().getString("skin"))).replace("STYLISTIC", entity.getPersistentData().getString("style")))
						.replace("ZPOS", "" + entity.getPersistentData().getDouble("z"))).replace("YPOS", "" + entity.getPersistentData().getDouble("y"))).replace("XPOS", "" + entity.getPersistentData().getDouble("x"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z"))), Vec2.ZERO,
									_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), thing);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals(ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString() + "_day")) {
							GiveNbtsProcedure.execute(entity, entityiterator, yaw);
							while (!((entityiterator.getPersistentData().getString("skin")).equals(entity.getPersistentData().getString("skin"))
									&& (entityiterator.getPersistentData().getString("style")).equals(entity.getPersistentData().getString("style")))) {
								entityiterator.getPersistentData().putString("skin", (entity.getPersistentData().getString("skin")));
								entityiterator.getPersistentData().putString("style", (entity.getPersistentData().getString("style")));
								SettingSkinProcedure.execute(entityiterator, entity.getPersistentData().getString("skin"), entity.getPersistentData().getString("style"));
							}
							if (entity instanceof FredbearEntity || entity instanceof SpringbonnieEntity || entity instanceof RetroFreddyEntity || entity instanceof RetroBonnieEntity || entity instanceof RetroChicaEntity
									|| entity instanceof RetroFoxyEntity || entity instanceof MrCanDoEntity || entity instanceof MrHugsEntity || entity instanceof BucketBobEntity || entity instanceof PanStanEntity
									|| entity instanceof NumberOneCrateEntity || entity instanceof BaggieMaggieEntity || entity instanceof NeddbearEntity || entity instanceof HappyFrogEntity || entity instanceof PigpatchEntity
									|| entity instanceof MrHippoEntity || entity instanceof OrvilleElephantEntity || entity instanceof RockstarFreddyEntity || entity instanceof RockstarBonnieEntity || entity instanceof RockstarChicaEntity
									|| entity instanceof RockstarFoxyEntity) {
								if (entityiterator instanceof FredbearDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(FredbearDayEntity.DATA_walker, true);
								if (entityiterator instanceof SpringbonnieDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(SpringbonnieDayEntity.DATA_walker, true);
								if (entityiterator instanceof RetroFreddyDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RetroFreddyDayEntity.DATA_walker, true);
								if (entityiterator instanceof RetroBonnieDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RetroBonnieDayEntity.DATA_walker, true);
								if (entityiterator instanceof RetroChicaDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RetroChicaDayEntity.DATA_walker, true);
								if (entityiterator instanceof RetroFoxyDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RetroFoxyDayEntity.DATA_walker, true);
								if (entityiterator instanceof MrCanDoDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(MrCanDoDayEntity.DATA_walker, true);
								if (entityiterator instanceof MrHugsDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(MrHugsDayEntity.DATA_walker, true);
								if (entityiterator instanceof BucketBobDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(BucketBobDayEntity.DATA_walker, true);
								if (entityiterator instanceof PanStanDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(PanStanDayEntity.DATA_walker, true);
								if (entityiterator instanceof NumberOneCrateDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(NumberOneCrateDayEntity.DATA_walker, true);
								if (entityiterator instanceof BaggieMaggieDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(BaggieMaggieDayEntity.DATA_walker, true);
								if (entityiterator instanceof NeddBearDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(NeddBearDayEntity.DATA_walker, true);
								if (entityiterator instanceof HappyFrogDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(HappyFrogDayEntity.DATA_walker, true);
								if (entityiterator instanceof PigpatchDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(PigpatchDayEntity.DATA_walker, true);
								if (entityiterator instanceof MrHippoDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(MrHippoDayEntity.DATA_walker, true);
								if (entityiterator instanceof OrvilleElephantDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(OrvilleElephantDayEntity.DATA_walker, true);
								if (entityiterator instanceof RockstarFreddyDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RockstarFreddyDayEntity.DATA_walker, true);
								if (entityiterator instanceof RockstarBonnieDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RockstarBonnieDayEntity.DATA_walker, true);
								if (entityiterator instanceof RockstarChicaDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RockstarChicaDayEntity.DATA_walker, true);
								if (entityiterator instanceof RockstarFoxyDayEntity _datEntSetL)
									_datEntSetL.getEntityData().set(RockstarFoxyDayEntity.DATA_walker, true);
							}
						}
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:dayinvisible"))) || entity instanceof GoldenFreddyEntity || entity instanceof WitheredGoldenFreddyEntity) {
			if (IsItNighttimeProcedure.execute(world) == false) {
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands()
								.performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("tp " + entity.getPersistentData().getDouble("x") + " " + entity.getPersistentData().getDouble("y") + " " + entity.getPersistentData().getDouble("z")));
					}
				}
				if (entity instanceof Mob _mobSetNoAi) {
					_mobSetNoAi.setNoAi(true);
				}
				if (!(entity instanceof GoldenFreddyEntity) && !(entity instanceof WitheredGoldenFreddyEntity)) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 1, false, false));
				}
			} else {
				if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:phantoms")))) {
					if (!(entity instanceof GoldenFreddyEntity || entity instanceof WitheredGoldenFreddyEntity || entity instanceof ShadowFreddyEntity || entity instanceof ShadowBonnieEntity)) {
						if (entity instanceof Mob _mobSetNoAi) {
							_mobSetNoAi.setNoAi(false);
						}
					} else {
						if (YaFnafmodModVariables.MapVariables.get(world).rare_night == true) {
							if (entity instanceof Mob _mobSetNoAi) {
								_mobSetNoAi.setNoAi(false);
							}
						} else {
							if (entity instanceof ShadowFreddyEntity || entity instanceof ShadowBonnieEntity) {
								if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 1, false, false));
							}
						}
					}
				} else {
					if (entity.getPersistentData().getBoolean("just_jumpscared") == true) {
						if (x == entity.getPersistentData().getDouble("x") && y == entity.getPersistentData().getDouble("y") && z == entity.getPersistentData().getDouble("z")) {
							if (entity instanceof Mob _mobSetNoAi) {
								_mobSetNoAi.setNoAi(true);
							}
						} else {
							if (entity instanceof Mob _mobSetNoAi) {
								_mobSetNoAi.setNoAi(false);
							}
						}
						if (entity instanceof Mob) {
							try {
								((Mob) entity).setTarget(null);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 5, 1));
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 5, 5));
					} else {
						if (entity instanceof Mob _mobSetNoAi) {
							_mobSetNoAi.setNoAi(false);
						}
					}
				}
			}
		} else if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:nightdisappear")))) {
			if (IsItNighttimeProcedure.execute(world) == false) {
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
