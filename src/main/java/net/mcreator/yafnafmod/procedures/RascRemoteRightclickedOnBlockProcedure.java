package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.server.level.ServerLevel;

import java.util.function.BiFunction;
import java.util.UUID;

public class RascRemoteRightclickedOnBlockProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return InteractionResult.PASS;
		Entity rasc = null;
		rasc = (new BiFunction<LevelAccessor, String, Entity>() {
			@Override
			public Entity apply(LevelAccessor levelAccessor, String uuid) {
				if (levelAccessor instanceof ServerLevel serverLevel) {
					try {
						return serverLevel.getEntity(UUID.fromString(uuid));
					} catch (Exception e) {
					}
				}
				return null;
			}
		}).apply(world, (itemstack.getOrCreateTag().getString("connected_rasc")));
		if (!(rasc == null)) {
			if (entity.isShiftKeyDown()) {
				if (rasc instanceof Mob _entity)
					_entity.getNavigation().moveTo(x, y, z, 3);
			} else {
				RascLureProcedure.execute(world, rasc.getX(), rasc.getY(), rasc.getZ());
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 40);
		}
		return InteractionResult.SUCCESS;
	}
}
