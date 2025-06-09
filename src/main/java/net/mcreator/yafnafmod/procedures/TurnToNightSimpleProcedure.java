package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.entity.ToyFreddyStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyChicaStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieStillDayEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PlushtrapEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NightmareBbEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MusicManDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.LeftyDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeChicaDayEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearDayEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.FoxyPirateDayEntity;
import net.mcreator.yafnafmod.entity.ElChipDayEntity;
import net.mcreator.yafnafmod.entity.CircusBabyDayEntity;
import net.mcreator.yafnafmod.entity.ChicaChickenDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;
import net.mcreator.yafnafmod.entity.BonnieBunnyDayEntity;
import net.mcreator.yafnafmod.entity.BalloraDayEntity;

import java.util.List;
import java.util.Comparator;

public class TurnToNightSimpleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		String command = "";
		String thing = "";
		if (DoesAnimatronicWalkAtNightProcedure.execute(entity) == true) {
			if (IsItNighttimeProcedure.execute(world) == true) {
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
				if (!(ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("still_day")) {
					if (!(entity.getPersistentData().getString("style")).isEmpty() && !(entity.getPersistentData().getString("skin")).isEmpty()
							|| (entity.getPersistentData().getString("style")).isEmpty() && !(entity.getPersistentData().getString("skin")).isEmpty()
							|| !(entity.getPersistentData().getString("style")).isEmpty() && (entity.getPersistentData().getString("skin")).isEmpty()) {
						command = (((((((("summon ENTITY_REGISTRY XPOS YPOS ZPOS {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {GotCordinates: 1b, x: XPOS, y: YPOS, style: \"STYLISTIC\", skin: \"SKINS\", z: ZPOS, yaw: YAW}, Attributes: [{Base: 0.2d, Name: \"minecraft:generic.movement_speed\"}], Invulnerable: 0b, FallDistance: 0.0f, CanUpdate: 1b, DeathTime: 0s, Rotation: [ZEDAWf, 0.0f], HandItems: [{}, {}], ArmorDropChances: [0.085f, 0.085f, 0.085f, 0.085f], Fire: 0s, ArmorItems: [{}, {}, {}, {}], CanPickUpLoot: 0b, HurtTime: 0s}"
								.replace("ENTITY_REGISTRY", ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString())).replace("_day", "")).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
								.replace("ZEDAW", "" + entity.getPersistentData().getDouble("yaw"))).replace("SKINS", entity.getPersistentData().getString("skin"))).replace("STYLISTIC", entity.getPersistentData().getString("style")))
								.replace("ZPOS", "" + entity.getPersistentData().getDouble("z"))).replace("YPOS", "" + entity.getPersistentData().getDouble("y"))).replace("XPOS", "" + entity.getPersistentData().getDouble("x"));
					} else {
						command = (((((("summon ENTITY_REGISTRY XPOS YPOS ZPOS {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {GotCordinates: 1b, x: XPOS, y: YPOS, z: ZPOS, yaw: YAW}, Attributes: [{Base: 0.2d, Name: \"minecraft:generic.movement_speed\"}], Invulnerable: 0b, FallDistance: 0.0f, CanUpdate: 1b, DeathTime: 0s, Rotation: [ZEDAWf, 0.0f], HandItems: [{}, {}], ArmorDropChances: [0.085f, 0.085f, 0.085f, 0.085f], Fire: 0s, ArmorItems: [{}, {}, {}, {}], CanPickUpLoot: 0b, HurtTime: 0s}"
								.replace("ENTITY_REGISTRY", ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString())).replace("_day", "")).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
								.replace("ZEDAW", "" + entity.getPersistentData().getDouble("yaw"))).replace("ZPOS", "" + entity.getPersistentData().getDouble("z"))).replace("YPOS", "" + entity.getPersistentData().getDouble("y")))
								.replace("XPOS", "" + entity.getPersistentData().getDouble("x"));
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z"))),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
				} else {
					if (!(entity.getPersistentData().getString("style")).isEmpty() && !(entity.getPersistentData().getString("skin")).isEmpty()
							|| (entity.getPersistentData().getString("style")).isEmpty() && !(entity.getPersistentData().getString("skin")).isEmpty()
							|| !(entity.getPersistentData().getString("style")).isEmpty() && (entity.getPersistentData().getString("skin")).isEmpty()) {
						command = ((((((((("summon ENTITY_REGISTRY ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {GotCordinates: 1b, x: XPOS, y: YPOS, style: \"STYLISTIC\", skin: \"SKINS\", z: ZPOS, yaw: YAW}, Attributes: [{Base: 0.2d, Name: \"minecraft:generic.movement_speed\"}], Invulnerable: 0b, Texture: \"ZETEXTURE\", FallDistance: 0.0f, CanUpdate: 1b, DeathTime: 0s, Rotation: [ZEDAWf, 0.0f], HandItems: [{}, {}], ArmorDropChances: [0.085f, 0.085f, 0.085f, 0.085f], Fire: 0s, ArmorItems: [{}, {}, {}, {}], CanPickUpLoot: 0b, HurtTime: 0s}"
								.replace("ENTITY_REGISTRY", ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString())).replace("_still_day", "")).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
								.replace("ZEDAW", "" + entity.getPersistentData().getDouble("yaw"))).replace("ZETEXTURE", GetTextureProcedure.execute(entity))).replace("SKINS", entity.getPersistentData().getString("skin")))
								.replace("STYLISTIC", entity.getPersistentData().getString("style"))).replace("ZPOS", "" + entity.getPersistentData().getDouble("z"))).replace("YPOS", "" + entity.getPersistentData().getDouble("y")))
								.replace("XPOS", "" + entity.getPersistentData().getDouble("x"));
					} else {
						command = ((((((((("summon ENTITY_REGISTRY ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {GotCordinates: 1b, x: XPOS, y: YPOS, z: ZPOS, yaw: YAW}, Attributes: [{Base: 0.2d, Name: \"minecraft:generic.movement_speed\"}], Invulnerable: 0b, FallDistance: 0.0f, CanUpdate: 1b, DeathTime: 0s, Rotation: [ZEDAWf, 0.0f], HandItems: [{}, {}], ArmorDropChances: [0.085f, 0.085f, 0.085f, 0.085f], Fire: 0s, ArmorItems: [{}, {}, {}, {}], CanPickUpLoot: 0b, HurtTime: 0s}"
								.replace("ENTITY_REGISTRY", ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString())).replace("_still_day", "")).replace("YAW", "" + entity.getPersistentData().getDouble("yaw")))
								.replace("ZEDAW", "" + entity.getPersistentData().getDouble("yaw"))).replace("ZETEXTURE", GetTextureProcedure.execute(entity))).replace("SKINS", entity.getPersistentData().getString("skin")))
								.replace("STYLISTIC", entity.getPersistentData().getString("style"))).replace("ZPOS", "" + entity.getPersistentData().getDouble("z"))).replace("YPOS", "" + entity.getPersistentData().getDouble("y")))
								.replace("XPOS", "" + entity.getPersistentData().getDouble("x"));
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z"))),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("_day", ""))
								|| (ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).replace("_still_day", ""))) {
							entityiterator.getPersistentData().putBoolean("GotCordinates", true);
							GiveNbtsProcedure.execute(entity, entityiterator, yaw);
							while (!((entityiterator.getPersistentData().getString("skin")).equals(entity.getPersistentData().getString("skin"))
									&& (entityiterator.getPersistentData().getString("style")).equals(entity.getPersistentData().getString("style")))) {
								entityiterator.getPersistentData().putString("skin", (entity.getPersistentData().getString("skin")));
								entityiterator.getPersistentData().putString("style", (entity.getPersistentData().getString("style")));
								SettingSkinProcedure.execute(entityiterator, entity.getPersistentData().getString("skin"));
							}
						}
						if ((ForgeRegistries.ENTITY_TYPES.getKey(entity.getType()).toString()).contains("_still_day")) {
							if (entityiterator instanceof ToyFreddyEntity _datEntSetL)
								_datEntSetL.getEntityData().set(ToyFreddyEntity.DATA_unmoving, true);
							if (entityiterator instanceof ToyBonnieEntity _datEntSetL)
								_datEntSetL.getEntityData().set(ToyBonnieEntity.DATA_unmoving, true);
							if (entityiterator instanceof ToyChicaEntity _datEntSetL)
								_datEntSetL.getEntityData().set(ToyChicaEntity.DATA_unmoving, true);
							if (entityiterator instanceof ToyFoxyEntity _datEntSetL)
								_datEntSetL.getEntityData().set(ToyFoxyEntity.DATA_unmoving, true);
						}
						if (entityiterator instanceof PlushtrapEntity || entityiterator instanceof NightmareBbEntity) {
							{
								Entity _ent = entity;
								if (!_ent.level().isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level().getServer(), _ent),
											("tp " + entity.getPersistentData().getDouble("x") + " " + (entity.getPersistentData().getDouble("y") + 1) + " " + entity.getPersistentData().getDouble("z")));
								}
							}
						}
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
		if (!(world instanceof Level _lvl85 && _lvl85.isDay())) {
			if (entity instanceof FreddyFazbearDayEntity) {
				((FreddyFazbearDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof BonnieBunnyDayEntity) {
				((BonnieBunnyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof ChicaChickenDayEntity) {
				((ChicaChickenDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof FoxyPirateDayEntity) {
				((FoxyPirateDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof ToyFreddyStillDayEntity) {
				((ToyFreddyStillDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof ToyBonnieStillDayEntity) {
				((ToyBonnieStillDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof ToyChicaStillDayEntity) {
				((ToyChicaStillDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof ToyFoxyStillDayEntity) {
				((ToyFoxyStillDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof RetroFreddyDayEntity) {
				((RetroFreddyDayEntity) entity).setAnimation("animation.freddy.retro_deactivated");
			}
			if (entity instanceof RetroBonnieDayEntity) {
				((RetroBonnieDayEntity) entity).setAnimation("animation.bonnie.perform_deactivated");
			}
			if (entity instanceof RetroChicaDayEntity) {
				((RetroChicaDayEntity) entity).setAnimation("animation.chica.retro_deactivate");
			}
			if (entity instanceof RetroFoxyDayEntity) {
				((RetroFoxyDayEntity) entity).setAnimation("animation.foxy.fox_retrodeactivate");
			}
			if (entity instanceof FredbearDayEntity) {
				((FredbearDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof SpringbonnieDayEntity) {
				((SpringbonnieDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof CircusBabyDayEntity) {
				((CircusBabyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof BalloraDayEntity) {
				((BalloraDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof FuntimeFreddyDayEntity) {
				((FuntimeFreddyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof FuntimeFoxyDayEntity) {
				((FuntimeFoxyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof BucketBobDayEntity) {
				((BucketBobDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof PanStanDayEntity) {
				((PanStanDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof MrHugsDayEntity) {
				((MrHugsDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof MrCanDoDayEntity) {
				((MrCanDoDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof NumberOneCrateDayEntity) {
				((NumberOneCrateDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof HappyFrogDayEntity) {
				((HappyFrogDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof PigpatchDayEntity) {
				((PigpatchDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof MrHippoDayEntity) {
				((MrHippoDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof NeddBearDayEntity) {
				((NeddBearDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof OrvilleElephantDayEntity) {
				((OrvilleElephantDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof RockstarFreddyDayEntity) {
				((RockstarFreddyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof RockstarBonnieDayEntity) {
				((RockstarBonnieDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof RockstarChicaDayEntity) {
				((RockstarChicaDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof RockstarFoxyDayEntity) {
				((RockstarFoxyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof LeftyDayEntity) {
				((LeftyDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof OrvilleElephantDayEntity) {
				((OrvilleElephantDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof ElChipDayEntity) {
				((ElChipDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof MusicManDayEntity) {
				((MusicManDayEntity) entity).setAnimation("0");
			}
			if (entity instanceof FuntimeChicaDayEntity) {
				((FuntimeChicaDayEntity) entity).setAnimation("0");
			}
		} else {
			if (entity instanceof FreddyFazbearDayEntity) {
				((FreddyFazbearDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof BonnieBunnyDayEntity) {
				((BonnieBunnyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ChicaChickenDayEntity) {
				((ChicaChickenDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof FoxyPirateDayEntity) {
				((FoxyPirateDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ToyFreddyStillDayEntity) {
				((ToyFreddyStillDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ToyBonnieStillDayEntity) {
				((ToyBonnieStillDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ToyChicaStillDayEntity) {
				((ToyChicaStillDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ToyFoxyStillDayEntity) {
				((ToyFoxyStillDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RetroFreddyDayEntity) {
				((RetroFreddyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RetroBonnieDayEntity) {
				((RetroBonnieDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RetroChicaDayEntity) {
				((RetroChicaDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RetroFoxyDayEntity) {
				((RetroFoxyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof FredbearDayEntity) {
				((FredbearDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof SpringbonnieDayEntity) {
				((SpringbonnieDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof CircusBabyDayEntity) {
				((CircusBabyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof BalloraDayEntity) {
				((BalloraDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof FuntimeFreddyDayEntity) {
				((FuntimeFreddyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof FuntimeFoxyDayEntity) {
				((FuntimeFoxyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof BucketBobDayEntity) {
				((BucketBobDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof PanStanDayEntity) {
				((PanStanDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof MrHugsDayEntity) {
				((MrHugsDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof MrCanDoDayEntity) {
				((MrCanDoDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NumberOneCrateDayEntity) {
				((NumberOneCrateDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NeddBearDayEntity) {
				((NeddBearDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof MrHippoDayEntity) {
				((MrHippoDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof HappyFrogDayEntity) {
				((HappyFrogDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof PigpatchDayEntity) {
				((PigpatchDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof OrvilleElephantDayEntity) {
				((OrvilleElephantDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RockstarFreddyDayEntity) {
				((RockstarFreddyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RockstarBonnieDayEntity) {
				((RockstarBonnieDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RockstarChicaDayEntity) {
				((RockstarChicaDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof RockstarFoxyDayEntity) {
				((RockstarFoxyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof LeftyDayEntity) {
				((LeftyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof OrvilleElephantDayEntity) {
				((OrvilleElephantDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof FuntimeChicaDayEntity) {
				((FuntimeChicaDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ElChipDayEntity) {
				((ElChipDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof MusicManDayEntity) {
				((MusicManDayEntity) entity).setAnimation("empty");
			}
		}
	}
}
