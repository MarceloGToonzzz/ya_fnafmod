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
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;

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
								("tp @s " + entity.getPersistentData().getDouble("x") + " " + entity.getPersistentData().getDouble("y") + " " + entity.getPersistentData().getDouble("z") + " " + entity.getPersistentData().getDouble("yaw") + " 0"));
					}
				}
				yaw = entity.getPersistentData().getDouble("yaw");
				entity_name = ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString() + "_day";
				ai = "1";
				thing = ((((((((((((("summon ENTITY_REGISTRY ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {walks_at_night:1b, controlshock_linked:1b, GotCordinates: 1b, x: XPOS, y: YPOS, style: STYLISTIC, skin: SKINNY, z: ZPOS, yaw: YAW,controlshock_x:XSHOCK,controlshock_y:YSHOCK,controlshock_z:ZSHOCK,skin:SKINNY,style:STYLISTIC,plushbabySetVariant:PbvBool,plushbabyVariant:PBV}, Attributes: [{Base: 0.2d, Name: \"minecraft:generic.movement_speed\"}], Invulnerable: 0b, FallDistance: 0.0f, CanUpdate: 1b, DeathTime: 0s, NoAI: MOVEEEb, Rotation: [ZEDAWf, 0.0f], HandItems: [{}, {}], ArmorDropChances: [0.085f, 0.085f, 0.085f, 0.085f], Fire: 0s, ArmorItems: [{}, {}, {}, {}], CanPickUpLoot: 0b, HurtTime: 0s}"
						.replace("PBV", "" + entity.getPersistentData().getDouble("plushbabyVariant"))).replace("PbvBool", "" + entity.getPersistentData().getBoolean("plushbabySetVariant")))
						.replace("ZSHOCK", "" + entity.getPersistentData().getDouble("controlshock_z"))).replace("YSHOCK", "" + entity.getPersistentData().getDouble("controlshock_y")))
						.replace("XSHOCK", "" + entity.getPersistentData().getDouble("controlshock_x"))).replace("ENTITY_REGISTRY", entity_name)).replace("MOVEEE", ai)).replace("STYLISTIC", "" + entity.getPersistentData().getDouble("style")))
						.replace("SKINNY", "" + entity.getPersistentData().getDouble("skin"))).replace("YAW", "" + entity.getPersistentData().getDouble("yaw"))).replace("ZEDAW", "" + entity.getPersistentData().getDouble("yaw")))
						.replace("ZPOS", "" + entity.getPersistentData().getDouble("z"))).replace("YPOS", "" + entity.getPersistentData().getDouble("y"))).replace("XPOS", "" + entity.getPersistentData().getDouble("x"));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z"))), Vec2.ZERO,
									_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), thing);
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(thing), false);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals(entity_name)) {
							entityiterator.getPersistentData().putDouble("skin", (entity.getPersistentData().getDouble("skin")));
							entityiterator.getPersistentData().putDouble("style", (entity.getPersistentData().getDouble("style")));
							entityiterator.getPersistentData().putDouble("plushbabyVariant", (entity.getPersistentData().getDouble("plushbabyVariant")));
							entityiterator.getPersistentData().putBoolean("plushbabySetVariant", (entity.getPersistentData().getBoolean("plushbabySetVariant")));
							SettingSkinProcedure.execute(entityiterator, entity.getPersistentData().getDouble("skin"), entity.getPersistentData().getDouble("style"));
						}
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:dayinvisible"))) || entity instanceof GoldenFreddyEntity || entity instanceof WitheredGoldenFreddyEntity) {
				if (IsItNighttimeProcedure.execute(world) == false) {
					if (YaFnafmodModVariables.MapVariables.get(world).STRUCTUREBUILD_BUILD == false) {
						{
							Entity _ent = entity;
							if (!_ent.level().isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
												_ent.getDisplayName(), _ent.level().getServer(), _ent),
										("tp " + entity.getPersistentData().getDouble("x") + " " + entity.getPersistentData().getDouble("y") + " " + entity.getPersistentData().getDouble("z")));
							}
						}
					}
					entity.setSilent(true);
					if (entity instanceof Mob _mobSetNoAi) {
						_mobSetNoAi.setNoAi(true);
					}
					if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:dayinvisible")))) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 1, false, false));
					}
				} else {
					if (!entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:phantoms")))) {
						if (!(entity instanceof GoldenFreddyEntity || entity instanceof WitheredGoldenFreddyEntity || entity instanceof ShadowFreddyEntity || entity instanceof ShadowBonnieEntity)) {
							entity.setSilent(false);
							if (entity instanceof Mob _mobSetNoAi) {
								_mobSetNoAi.setNoAi(false);
							}
						} else {
							if (YaFnafmodModVariables.MapVariables.get(world).rare_night == true) {
								entity.setSilent(false);
								if (entity instanceof Mob _mobSetNoAi) {
									_mobSetNoAi.setNoAi(false);
								}
							} else {
								if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:dayinvisible")))) {
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
}
