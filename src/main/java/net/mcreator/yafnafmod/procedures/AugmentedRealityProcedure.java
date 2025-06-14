package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

import javax.annotation.Nullable;

import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class AugmentedRealityProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double distance = 0;
		double Y_Val = 0;
		double Z_Val = 0;
		double X_Val = 0;
		String teamname = "";
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.PHONE_SMART.get()) {
			while (distance < 20) {
				if (!(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity))
						.getType() == HitResult.Type.BLOCK)) {
					distance = distance + 1;
					if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(X_Val, Y_Val, Z_Val), 4, 4, 4), e -> true).isEmpty()) {
						if (!((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
								? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
								: "").equals("augmented_reality"))) {
							entity.getPersistentData().putString("TeamName",
									(entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
											? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
											: ""));
						}
						{
							final Vec3 _center = new Vec3(X_Val, Y_Val, Z_Val);
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entityiterator instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
										? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
										: "").equals("augmented_reality")) {
									if (!(entityiterator instanceof Player)) {
										if (entityiterator instanceof Mob _entity && entity instanceof LivingEntity _ent)
											_entity.setTarget(_ent);
									}
									{
										Entity _entityTeam = entity;
										PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam(
												(entityiterator instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
														? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
														: ""));
										if (_pt != null) {
											if (_entityTeam instanceof Player _player)
												_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
											else
												_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
										}
									}
								}
							}
						}
						distance = 20;
						break;
					} else {
						X_Val = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getX();
						Y_Val = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getY();
						Z_Val = entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(distance)), ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ();
						{
							Entity _entityTeam = entity;
							PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam((entity.getPersistentData().getString("TeamName")));
							if (_pt != null) {
								if (_entityTeam instanceof Player _player)
									_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
								else
									_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
							}
						}
						continue;
					}
				} else {
					break;
				}
			}
		} else if ((entity instanceof LivingEntity _teamEnt && _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()) != null
				? _teamEnt.level().getScoreboard().getPlayersTeam(_teamEnt instanceof Player _pl ? _pl.getGameProfile().getName() : _teamEnt.getStringUUID()).getName()
				: "").equals("augmented_reality")) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam((entity.getPersistentData().getString("TeamName")));
				if (_pt != null) {
					if (_entityTeam instanceof Player _player)
						_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
					else
						_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
				}
			}
		}
	}
}
