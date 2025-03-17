package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;
import net.mcreator.yafnafmod.entity.ShadowFreddyEntity;
import net.mcreator.yafnafmod.entity.ShadowBonnieEntity;
import net.mcreator.yafnafmod.entity.GoldenFreddyEntity;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class DontLookAtFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (IsItNighttimeProcedure.execute(world) == true && YaFnafmodModVariables.MapVariables.get(world).rare_night == true) {
					if (entity instanceof GoldenFreddyEntity || (entity instanceof ShadowFreddyEntity || entity instanceof ShadowBonnieEntity) && entityiterator.getPersistentData().getBoolean("hiding_mask") == false) {
						if (entityiterator instanceof Player || entityiterator instanceof Villager) {
							if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
								if (IsEntityBeingLookedAtProcedure.execute(world, entity, entityiterator, 0.625) == true && (entity instanceof LivingEntity _entity ? _entity.hasLineOfSight(entityiterator) : false)) {
									entity.getPersistentData().putDouble("scream_tick", (entity.getPersistentData().getDouble("scream_tick") + 1));
									if (entity.getPersistentData().getBoolean("started_mumbling") == false) {
										if (world instanceof Level)
											((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:anima_gfreddy_mumble")), SoundSource.NEUTRAL, 1, 1);
										entity.getPersistentData().putBoolean("started_mumbling", true);
									}
									if (entity.getPersistentData().getDouble("scream_tick") >= 20) {
										if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
											entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1);
										}
									}
									entity.getPersistentData().putBoolean("can_tp", false);
								}
							}
						}
					}
				}
			}
		}
		if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty())) {
			entity.getPersistentData().putBoolean("can_tp", true);
			entity.getPersistentData().putBoolean("started_mumbling", false);
			entity.getPersistentData().putDouble("scream_tick", 0);
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (!(!world.getEntitiesOfClass(GoldenFreddyEntity.class, AABB.ofSize(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), 32, 32, 32), e -> true).isEmpty())) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "stopsound @s * ya_fnafmod:anima_gfreddy_mumble");
						}
					}
				}
			}
		}
	}
}
