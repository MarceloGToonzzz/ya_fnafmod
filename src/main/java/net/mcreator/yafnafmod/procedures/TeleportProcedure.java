package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import java.util.Comparator;

public class TeleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		boolean restart = false;
		double Xcord = 0;
		double triestillfailure = 0;
		double Ycord = 0;
		double Zcord = 0;
		Entity fagas = null;
		if (!(entity instanceof Mob _mobGetNoAi ? _mobGetNoAi.isNoAi() : false)) {
			triestillfailure = 100;
			found = false;
			while (!(triestillfailure <= 0) || !found) {
				if (triestillfailure <= 0) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("could not find spot to teleport to"), true);
					break;
				} else {
					triestillfailure = triestillfailure - 1;
				}
				restart = false;
				Xcord = x + Mth.nextInt(RandomSource.create(), -16, 16);
				Ycord = y + Mth.nextInt(RandomSource.create(), -16, 16);
				Zcord = z + Mth.nextInt(RandomSource.create(), -16, 16);
				if (Ycord <= -64) {
					Ycord = -63;
				} else if (Ycord >= 319) {
					Ycord = 318;
				}
				while (!((world.getBlockState(BlockPos.containing(Xcord, Ycord, Zcord))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xcord, Ycord + 1, Zcord))).getBlock() == Blocks.AIR)) {
					if (Ycord == 318 || Ycord == y + 33) {
						restart = true;
						break;
					} else {
						Ycord = Ycord + 1;
					}
				}
				if (restart) {
					continue;
				}
				while ((world.getBlockState(BlockPos.containing(Xcord, Ycord - 1, Zcord))).getBlock() == Blocks.AIR) {
					if (Ycord == -64 || Ycord == y - 33) {
						restart = true;
						break;
					} else {
						Ycord = Ycord - 1;
					}
				}
				if (restart) {
					continue;
				}
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					if (new Vec3(Xcord, Ycord, Zcord).distanceTo(new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()))) > 16) {
						restart = true;
						entity.lookAt(EntityAnchorArgument.Anchor.EYES,
								new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()),
										((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - 1 + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getEyeHeight()),
										((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
					}
				} else {
					if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(Xcord, Ycord, Zcord), 32, 32, 32), e -> true).isEmpty()
							|| !world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(Xcord, Ycord, Zcord), 32, 32, 32), e -> true).isEmpty())) {
						restart = true;
						if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(Xcord, Ycord, Zcord), 8, 8, 8), e -> true).isEmpty()) {
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() - 1 + ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyeHeight()), (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())));
						} else if (!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(Xcord, Ycord, Zcord), 8, 8, 8), e -> true).isEmpty()) {
							entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3((((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getX()), (((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() - 1 + ((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getEyeHeight()), (((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())));
						}
					}
				}
				if (restart) {
					continue;
				}
				if (!((world.getBlockState(BlockPos.containing(Xcord, Ycord, Zcord))).getBlock() == Blocks.AIR)) {
					restart = true;
				}
				if (restart) {
					continue;
				}
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
					if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(Xcord, Ycord, Zcord), 32, 32, 32), e -> true).isEmpty()) {
						fagas = (Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null);
					} else if (!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(Xcord, Ycord, Zcord), 32, 32, 32), e -> true).isEmpty()) {
						fagas = (Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null);
					}
					if (fagas instanceof LivingEntity) {
						if (!world.canSeeSkyFromBelowWater(BlockPos.containing(fagas.getX(), fagas.getY(), fagas.getZ()))) {
							restart = true;
						}
					} else {
						restart = true;
					}
				}
				if (restart) {
					continue;
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(Xcord, Ycord, Zcord);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(Xcord, Ycord, Zcord, _ent.getYRot(), _ent.getXRot());
				}
				found = true;
			}
		}
	}
}
