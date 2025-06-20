package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.item.ShotgunItem;
import net.mcreator.yafnafmod.item.PopgunRevolverItem;
import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModEntities;
import net.mcreator.yafnafmod.entity.ShotgunShellProjectileEntity;
import net.mcreator.yafnafmod.entity.PopgunBulletProjectileEntity;
import net.mcreator.yafnafmod.entity.OfficeChairRedEntityEntity;
import net.mcreator.yafnafmod.entity.OfficeChairBlackEntityEntity;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class ShotgunRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double multiplier = 0;
		if (!entity.isPassenger()) {
			multiplier = -1;
		} else {
			if ((entity.getVehicle()) instanceof OfficeChairRedEntityEntity || (entity.getVehicle()) instanceof OfficeChairBlackEntityEntity) {
				multiplier = -4;
			} else {
				multiplier = -1.5;
			}
		}
		if (!(entity instanceof Player _plrCldCheck6 && _plrCldCheck6.getCooldowns().isOnCooldown(itemstack.getItem()))) {
			if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity) || itemstack.getItem() == YaFnafmodModItems.SHOTGUN.get() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(YaFnafmodModItems.SHOTGUN_SHELL.get())) : false)
					|| itemstack.getItem() == YaFnafmodModItems.POPGUN_REVOLVER.get() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(YaFnafmodModItems.POPGUN_BULLET.get())) : false)) {
				if (itemstack.getItem() == YaFnafmodModItems.SHOTGUN.get()) {
					if (itemstack.getItem() instanceof ShotgunItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "animation.shotgun.shoot");
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
					if (!entity.isPassenger()) {
						entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * Mth.nextInt(RandomSource.create(), (int) 1.25, (int) 0.75) * multiplier + entity.getDeltaMovement().x()),
								(entity.getLookAngle().y * Mth.nextInt(RandomSource.create(), (int) 1.25, (int) 0.75) * multiplier + entity.getDeltaMovement().y()),
								(entity.getLookAngle().z * Mth.nextInt(RandomSource.create(), (int) 1.25, (int) 0.75) * multiplier + entity.getDeltaMovement().z())));
					} else {
						(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * Mth.nextInt(RandomSource.create(), (int) 1.25, (int) 0.75) * multiplier + entity.getDeltaMovement().x()),
								(entity.getLookAngle().y * Mth.nextInt(RandomSource.create(), (int) 1.25, (int) 0.75) * multiplier + entity.getDeltaMovement().y()),
								(entity.getLookAngle().z * Mth.nextInt(RandomSource.create(), (int) 1.25, (int) 0.75) * multiplier + entity.getDeltaMovement().z())));
					}
				} else if (itemstack.getItem() == YaFnafmodModItems.POPGUN_REVOLVER.get()) {
					if (itemstack.getItem() instanceof PopgunRevolverItem)
						itemstack.getOrCreateTag().putString("geckoAnim", "animation.model.shoot");
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.pickup")), SoundSource.NEUTRAL, 1, 1);
				}
				if (itemstack.getItem() == YaFnafmodModItems.SHOTGUN.get()) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new ShotgunShellProjectileEntity(YaFnafmodModEntities.SHOTGUN_SHELL_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 7, 2);
						_entityToSpawn.setPos(x, (y + entity.getEyeHeight()), z);
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					new Object() {
						void timedLoop(int timedloopiterator, int timedlooptotal, int ticks) {
							if (world instanceof ServerLevel projectileLevel) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new ShotgunShellProjectileEntity(YaFnafmodModEntities.SHOTGUN_SHELL_PROJECTILE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 7, 2);
								_entityToSpawn.setPos(x, (y + entity.getEyeHeight()), z);
								_entityToSpawn.shoot((entity.getLookAngle().x + Mth.nextDouble(RandomSource.create(), -0.25, 0.25)), (entity.getLookAngle().y + Mth.nextDouble(RandomSource.create(), -0.25, 0.25)),
										(entity.getLookAngle().z + Mth.nextDouble(RandomSource.create(), -0.25, 0.25)), 6, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
							final int tick2 = ticks;
							YaFnafmodMod.queueServerWork(tick2, () -> {
								if (timedlooptotal > timedloopiterator + 1) {
									timedLoop(timedloopiterator + 1, timedlooptotal, tick2);
								}
							});
						}
					}.timedLoop(0, 4, 1);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(YaFnafmodModItems.SHOTGUN_SHELL.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 3, _player.inventoryMenu.getCraftSlots());
					}
				} else if (itemstack.getItem() == YaFnafmodModItems.POPGUN_REVOLVER.get()) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new PopgunBulletProjectileEntity(YaFnafmodModEntities.POPGUN_BULLET_PROJECTILE.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, (float) 0.5, (int) 0.125);
						_entityToSpawn.setPos(x, (y + entity.getEyeHeight()), z);
						_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y), (entity.getLookAngle().z), 6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(YaFnafmodModItems.POPGUN_BULLET.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 30);
			}
		}
	}
}
