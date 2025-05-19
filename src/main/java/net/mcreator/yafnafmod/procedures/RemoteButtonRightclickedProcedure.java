package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.server.level.ServerLevel;

import java.util.UUID;

public class RemoteButtonRightclickedProcedure {
	public static InteractionResult execute(LevelAccessor world, ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getString("shreddyLinked")).isEmpty()) {
			if (new Object() {
				boolean isStringUUIDValid(String uuid) {
					boolean valid;
					try {
						UUID.fromString(uuid);
						valid = true;
					} catch (Exception e) {
						valid = false;
					}
					return valid;
				}
			}.isStringUUIDValid((itemstack.getOrCreateTag().getString("shreddyLinked")))) {
				ShreddyChairActivateProcedure.execute(new Object() {
					Entity entityFromStringUUID(String uuid, Level world) {
						Entity _uuidentity = null;
						if (world instanceof ServerLevel _server) {
							try {
								_uuidentity = _server.getEntity(UUID.fromString(uuid));
							} catch (Exception e) {
							}
						}
						return _uuidentity;
					}
				}.entityFromStringUUID((itemstack.getOrCreateTag().getString("shreddyLinked")), (Level) world));
			}
		}
		return InteractionResult.SUCCESS;
	}
}
