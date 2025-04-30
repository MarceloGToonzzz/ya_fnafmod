package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;
import net.mcreator.yafnafmod.entity.BaggieMaggieDayEntity;

import java.util.List;
import java.util.Comparator;

public class SpawnItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean done = false;
		double yaw = 0;
		double xex = 0;
		double yey = 0;
		double zez = 0;
		String og_registry = "";
		String command = "";
		String AI = "";
		String spawned = "";
		if (!itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:prop_entities")))) {
			og_registry = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("_spawn_item", "_day");
			spawned = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("_spawn_item", "_day");
			if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("fms")) {
				spawned = spawned.replace("_fms", "");
			}
			if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("stage_01")) {
				spawned = spawned.replace("_stage_01", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("fixed")) {
				spawned = spawned.replace("_fixed", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("alt")) {
				spawned = spawned.replace("_alt", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("vr")) {
				spawned = spawned.replace("_vr", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("solid")) {
				spawned = spawned.replace("_solid", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("poster")) {
				spawned = spawned.replace("_poster", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("novel")) {
				spawned = spawned.replace("_novel", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("frights")) {
				spawned = spawned.replace("_frights", "");
			} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("meme")) {
				spawned = spawned.replace("_meme", "");
			}
			if (spawned.contains("walker")) {
				spawned = spawned.replace("_walker", "");
			}
			if (spawned.contains("phantom") || spawned.contains("nightmare") && !spawned.contains("bb") || spawned.contains("jack_o") || spawned.contains("nightmarionne") || (spawned).equals("ya_fnafmod:golden_freddy_day")
					|| (spawned).equals("ya_fnafmod:withered_golden_freddy_day") || (spawned).equals("ya_fnafmod:shadow_freddy_day") || (spawned).equals("ya_fnafmod:shadow_bonnie_day") || (spawned).equals("ya_fnafmod:ennard_day")
					|| (spawned).equals("ya_fnafmod:lolbit_day") || (spawned).equals("ya_fnafmod:yenndo_day") || (spawned).equals("ya_fnafmod:helpy_day") || (spawned).equals("ya_fnafmod:molten_freddy_day")
					|| (spawned).equals("ya_fnafmod:scraptrap_day") || (spawned).equals("ya_fnafmod:scrap_baby_day")) {
				spawned = spawned.replace("_day", "");
				AI = "0";
			} else if (((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("toy") || (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("gus_the_pug"))
					&& !(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("still")) {
				AI = "0";
			} else {
				AI = "1";
			}
			xex = Math.round(Math.pow(10, 0) * x) / Math.pow(10, 0) + 0.5;
			if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:slabs")))) {
				yey = Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) + 1;
			} else {
				yey = Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) + 1.5;
			}
			zez = Math.round(Math.pow(10, 0) * z) / Math.pow(10, 0) + 0.5;
			yaw = entity.getYRot() / 45;
			yaw = Math.round(yaw);
			yaw = yaw * 45;
			yaw = yaw + 180;
			command = ((("summon ENTITY XYZ {NoAI:MOOVEb,Rotation:[YAW]}".replace("YAW", yaw + "f")).replace("XYZ", (xex + " ") + "" + (yey + " ") + zez)).replace("MOOVE", AI)).replace("ENTITY", spawned);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
			{
				final Vec3 _center = new Vec3(x, (y + 1), z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (done == false) {
						if (entityiterator.getX() == x + 0.5 && (entityiterator.getY() == y + 1 || entityiterator.getY() == y + 1.5) && entityiterator.getZ() == z + 0.5) {
							if ((ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals(spawned) || (ForgeRegistries.ENTITY_TYPES.getKey(entityiterator.getType()).toString()).equals(spawned.replace("_day", ""))) {
								if (og_registry.contains("fms")) {
									entityiterator.getPersistentData().putString("style", "fms");
								}
								if (og_registry.contains("stage_01")) {
									entityiterator.getPersistentData().putString("skin", "stage01");
								} else if (og_registry.contains("fixed")) {
									entityiterator.getPersistentData().putString("skin", "fixed");
								} else if (og_registry.contains("alt")) {
									entityiterator.getPersistentData().putString("skin", "alt");
								} else if (og_registry.contains("vr")) {
									entityiterator.getPersistentData().putString("skin", "vr_trailer");
								} else if (og_registry.contains("solid")) {
									entityiterator.getPersistentData().putString("skin", "solid");
								} else if (og_registry.contains("poster")) {
									entityiterator.getPersistentData().putString("skin", "poster");
								} else if (og_registry.contains("novel")) {
									entityiterator.getPersistentData().putString("skin", "novel");
								} else if (og_registry.contains("frights")) {
									entityiterator.getPersistentData().putString("skin", "frights");
								} else if (og_registry.contains("meme")) {
									entityiterator.getPersistentData().putString("skin", "meme");
								}
								if (og_registry.contains("walker")) {
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
									if (entityiterator instanceof BucketBobDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(BucketBobDayEntity.DATA_walker, true);
									if (entityiterator instanceof PanStanDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(PanStanDayEntity.DATA_walker, true);
									if (entityiterator instanceof MrHugsDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(MrHugsDayEntity.DATA_walker, true);
									if (entityiterator instanceof MrCanDoDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(MrCanDoDayEntity.DATA_walker, true);
									if (entityiterator instanceof NumberOneCrateDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(NumberOneCrateDayEntity.DATA_walker, true);
									if (entityiterator instanceof BaggieMaggieDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(BaggieMaggieDayEntity.DATA_walker, true);
									if (entityiterator instanceof HappyFrogDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(HappyFrogDayEntity.DATA_walker, true);
									if (entityiterator instanceof MrHippoDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(MrHippoDayEntity.DATA_walker, true);
									if (entityiterator instanceof NeddBearDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(NeddBearDayEntity.DATA_walker, true);
									if (entityiterator instanceof PigpatchDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(PigpatchDayEntity.DATA_walker, true);
									if (entityiterator instanceof RockstarFreddyDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(RockstarFreddyDayEntity.DATA_walker, true);
									if (entityiterator instanceof RockstarBonnieDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(RockstarBonnieDayEntity.DATA_walker, true);
									if (entityiterator instanceof RockstarChicaDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(RockstarChicaDayEntity.DATA_walker, true);
									if (entityiterator instanceof RockstarFoxyDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(RockstarFoxyDayEntity.DATA_walker, true);
									if (entityiterator instanceof OrvilleElephantDayEntity _datEntSetL)
										_datEntSetL.getEntityData().set(OrvilleElephantDayEntity.DATA_walker, true);
								}
							}
							done = true;
						}
					}
				}
			}
		} else if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:prop_entities")))) {
			spawned = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("_spawn_item", "");
			if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:slabs")))) {
				command = "summon ENTITY ~0.5 ~1 ~0.5 {NoAI:1b}".replace("ENTITY", spawned);
			} else {
				command = "summon ENTITY ~0.5 ~0.5 ~0.5 {NoAI:1b}".replace("ENTITY", spawned);
			}
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
		}
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
