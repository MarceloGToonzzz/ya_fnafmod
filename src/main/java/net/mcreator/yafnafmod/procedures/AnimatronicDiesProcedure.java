package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;
import net.mcreator.yafnafmod.entity.FuntimeFreddyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFreddyDayEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyEntity;
import net.mcreator.yafnafmod.entity.FuntimeFoxyDayEntity;
import net.mcreator.yafnafmod.entity.CircusBabyEntity;
import net.mcreator.yafnafmod.entity.CircusBabyDayEntity;
import net.mcreator.yafnafmod.entity.BalloraEntity;
import net.mcreator.yafnafmod.entity.BalloraDayEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AnimatronicDiesProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
		execute(null, world, x, y, z, damagesource, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (entity instanceof BalloraEntity) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"stopsound @a * ya_fnafmod:anim_ballora_crumblingdreams");
		}
		if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("ya_fnafmod:scooped")))) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:remnant_agony_havers")))) {
				if (entity instanceof CircusBabyEntity || entity instanceof CircusBabyDayEntity) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = YaFnafmodModEntities.BLOB_CIRCUS_BABY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else if (entity instanceof BalloraEntity || entity instanceof BalloraDayEntity) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = YaFnafmodModEntities.BLOB_BALLORA.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModBlocks.PIECES_BALLORA.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (entity instanceof FuntimeFreddyEntity || entity instanceof FuntimeFreddyDayEntity) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = YaFnafmodModEntities.BLOB_FUNTIME_FREDDY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModBlocks.PIECES_FUNTIME_FREDDY.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (entity instanceof FuntimeFoxyEntity || entity instanceof FuntimeFoxyDayEntity) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = YaFnafmodModEntities.BLOB_FUNTIME_FOXY.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModBlocks.PIECES_FUNTIME_FOXY.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 5); index0++) {
					if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.REMNANT.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(YaFnafmodModItems.AGONY.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}
