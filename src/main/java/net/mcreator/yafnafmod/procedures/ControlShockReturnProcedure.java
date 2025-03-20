package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;
import net.mcreator.yafnafmod.entity.FuntimeDelilahEntity;

import java.util.Comparator;

public class ControlShockReturnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("controlshock_x"), entity.getPersistentData().getDouble("controlshock_y"), entity.getPersistentData().getDouble("controlshock_z")))).getBlock()
				.getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4
						? (world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("controlshock_x"), entity.getPersistentData().getDouble("controlshock_y"), entity.getPersistentData().getDouble("controlshock_z"))))
								.getValue(_getip4)
						: -1) == 1
				&& (world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("controlshock_x"), entity.getPersistentData().getDouble("controlshock_y"), entity.getPersistentData().getDouble("controlshock_z"))))
						.getBlock() == YaFnafmodModBlocks.SHOCK_INFUSER.get()) {
			if (entity.getPersistentData().getBoolean("played_shock_sound") == false) {
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:controlshock_shock")), SoundSource.NEUTRAL, 1, 1);
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("played_shock_sound", true);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (entity.getPersistentData().getDouble("shock_tick") > 18) {
				entity.getPersistentData().putDouble("shock_tick", 0);
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("played_shock_sound", false);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (entity.getPersistentData().getDouble("shock_tick") == 0 || entity.getPersistentData().getDouble("shock_tick") == 6 || entity.getPersistentData().getDouble("shock_tick") == 12) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("ya_fnafmod:controlled_shock")))), 1);
			}
			if (entity.getPersistentData().getBoolean("GotCordinates") == true) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")), 2);
				if (entity instanceof FuntimeDelilahEntity) {
					if (!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
						if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					} else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
						if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					}
				}
			}
			entity.getPersistentData().putDouble("shock_tick", (entity.getPersistentData().getDouble("shock_tick") + 1));
		}
	}
}
