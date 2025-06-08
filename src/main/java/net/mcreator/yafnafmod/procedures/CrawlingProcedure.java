package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;
import net.mcreator.yafnafmod.entity.WitheredChicaEntity;
import net.mcreator.yafnafmod.entity.WitheredBonnieEntity;
import net.mcreator.yafnafmod.entity.ToyFoxyEntity;
import net.mcreator.yafnafmod.entity.ToyChicaEntity;
import net.mcreator.yafnafmod.entity.ToyBonnieEntity;
import net.mcreator.yafnafmod.entity.SpringtrapEntity;
import net.mcreator.yafnafmod.entity.ScraptrapEntity;
import net.mcreator.yafnafmod.entity.ScrapBabyEntity;
import net.mcreator.yafnafmod.entity.PigpatchEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.MrHippoEntity;
import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;
import net.mcreator.yafnafmod.entity.MangleEntity;
import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.JJEntity;
import net.mcreator.yafnafmod.entity.HappyFrogEntity;
import net.mcreator.yafnafmod.entity.EnnardEntity;
import net.mcreator.yafnafmod.entity.ElectrobabEntity;
import net.mcreator.yafnafmod.entity.DrTeethEntity;
import net.mcreator.yafnafmod.entity.BidybabEntity;
import net.mcreator.yafnafmod.entity.BalloonBoyEntity;

import java.util.List;
import java.util.Comparator;

public class CrawlingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() || (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.AIR)
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.VENT_SHAFT.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.SECURITY_VENT.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.DOORFRAME_DARK.get()) && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.DOORFRAME_LIGHT.get())) {
			if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D) {
				if (entity instanceof MangleEntity) {
					((MangleEntity) entity).setAnimation("animation.mangle.crawl");
				}
				if (entity instanceof BalloonBoyEntity) {
					((BalloonBoyEntity) entity).setAnimation("animation.bb.crawl");
				}
				if (entity instanceof JJEntity) {
					((JJEntity) entity).setAnimation("animation.bb.crawl");
				}
				if (entity instanceof ToyBonnieEntity) {
					((ToyBonnieEntity) entity).setAnimation("animation.bonnie.crawl");
				}
				if (entity instanceof ToyChicaEntity) {
					((ToyChicaEntity) entity).setAnimation("animation.chica.crawl");
				}
				if (entity instanceof WitheredBonnieEntity) {
					((WitheredBonnieEntity) entity).setAnimation("animation.bonnie.crawl");
				}
				if (entity instanceof WitheredChicaEntity) {
					((WitheredChicaEntity) entity).setAnimation("animation.chica.crawl");
				}
				if (entity instanceof ToyFoxyEntity) {
					((ToyFoxyEntity) entity).setAnimation("animation.toyfoxy.crawl");
				}
				if (entity instanceof SpringtrapEntity) {
					((SpringtrapEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof EnnardEntity) {
					((EnnardEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof BidybabEntity) {
					((BidybabEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof ElectrobabEntity) {
					((ElectrobabEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof MoltenFreddyEntity) {
					((MoltenFreddyEntity) entity).setAnimation("animation.funtime_freddy.crawl");
				}
				if (entity instanceof ScraptrapEntity) {
					((ScraptrapEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof ScrapBabyEntity) {
					((ScrapBabyEntity) entity).setAnimation("animation.baby.crawl");
				}
				if (entity instanceof NeddbearEntity) {
					((NeddbearEntity) entity).setAnimation("animation.neddbear.crawl");
				}
				if (entity instanceof MrHippoEntity) {
					((MrHippoEntity) entity).setAnimation("animation.hippo.crawl");
				}
				if (entity instanceof PigpatchEntity) {
					((PigpatchEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof HappyFrogEntity) {
					((HappyFrogEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof OrvilleElephantEntity) {
					((OrvilleElephantEntity) entity).setAnimation("animation.model.crawl");
				}
				if (entity instanceof LeftyEntity) {
					((LeftyEntity) entity).setAnimation("animation.lefty.crawl");
				}
				if (!entity.isSprinting()) {
					if (entity instanceof DrTeethEntity) {
						((DrTeethEntity) entity).setAnimation("animation.model.drteeth_crawl");
					}
				} else {
					if (entity instanceof DrTeethEntity) {
						((DrTeethEntity) entity).setAnimation("animation.model.drteeth_crawl_aggro");
					}
				}
			} else {
				if (entity instanceof MangleEntity) {
					((MangleEntity) entity).setAnimation("animation.mangle.crawl");
				}
				if (entity instanceof BalloonBoyEntity) {
					((BalloonBoyEntity) entity).setAnimation("animation.bb.crawl_idle_bb");
				}
				if (entity instanceof ToyBonnieEntity) {
					((ToyBonnieEntity) entity).setAnimation("animation.bonnie.crawl");
				}
				if (entity instanceof ToyChicaEntity) {
					((ToyChicaEntity) entity).setAnimation("animation.chica.crawl_idle");
				}
				if (entity instanceof WitheredBonnieEntity) {
					((WitheredBonnieEntity) entity).setAnimation("animation.bonnie.crawl_idle");
				}
				if (entity instanceof WitheredChicaEntity) {
					((WitheredChicaEntity) entity).setAnimation("animation.chica.crawl_idle");
				}
				if (entity instanceof JJEntity) {
					((JJEntity) entity).setAnimation("animation.bb.crawl_idle_jj");
				}
				if (entity instanceof ToyFoxyEntity) {
					((ToyFoxyEntity) entity).setAnimation("animation.toyfoxy.crawl_idle");
				}
				if (entity instanceof SpringtrapEntity) {
					((SpringtrapEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof EnnardEntity) {
					((EnnardEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof BidybabEntity) {
					((BidybabEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof ElectrobabEntity) {
					((ElectrobabEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof MoltenFreddyEntity) {
					((MoltenFreddyEntity) entity).setAnimation("animation.funtime_freddy.crawl_idle");
				}
				if (entity instanceof ScraptrapEntity) {
					((ScraptrapEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof ScrapBabyEntity) {
					((ScrapBabyEntity) entity).setAnimation("animation.baby.crawl_idle");
				}
				if (entity instanceof NeddbearEntity) {
					((NeddbearEntity) entity).setAnimation("animation.neddbear.crawl_idle");
				}
				if (entity instanceof MrHippoEntity) {
					((MrHippoEntity) entity).setAnimation("animation.hippo.crawl_idle");
				}
				if (entity instanceof PigpatchEntity) {
					((PigpatchEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof HappyFrogEntity) {
					((HappyFrogEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof OrvilleElephantEntity) {
					((OrvilleElephantEntity) entity).setAnimation("animation.model.crawl_idle");
				}
				if (entity instanceof LeftyEntity) {
					((LeftyEntity) entity).setAnimation("animation.lefty.crawl_idle");
				}
				if (entity instanceof DrTeethEntity) {
					((DrTeethEntity) entity).setAnimation("animation.model.drteeth_crawl_idle");
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
				if (!(new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
						}
						return false;
					}
				}.checkGamemode(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null))) || new Object() {
					public boolean checkGamemode(Entity _ent) {
						if (_ent instanceof ServerPlayer _serverPlayer) {
							return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
						} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
							return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
									&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
						}
						return false;
					}
				}.checkGamemode(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null))))) {
					if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
						_entity.setTarget(_ent);
				}
			} else if (!world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
				if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(Villager.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
			}
		} else {
			if (!world.getBlockState(BlockPos.containing(x, y + 2, z)).canOcclude()) {
				if (entity instanceof MangleEntity) {
					((MangleEntity) entity).setAnimation("empty");
				}
				if (entity instanceof BalloonBoyEntity) {
					((BalloonBoyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof ToyBonnieEntity) {
					((ToyBonnieEntity) entity).setAnimation("empty");
				}
				if (entity instanceof ToyChicaEntity) {
					((ToyChicaEntity) entity).setAnimation("empty");
				}
				if (entity instanceof WitheredBonnieEntity) {
					((WitheredBonnieEntity) entity).setAnimation("empty");
				}
				if (entity instanceof WitheredChicaEntity) {
					((WitheredChicaEntity) entity).setAnimation("empty");
				}
				if (entity instanceof JJEntity) {
					((JJEntity) entity).setAnimation("empty");
				}
				if (entity instanceof ToyFoxyEntity) {
					((ToyFoxyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof SpringtrapEntity) {
					((SpringtrapEntity) entity).setAnimation("empty");
				}
				if (entity instanceof BidybabEntity) {
					((BidybabEntity) entity).setAnimation("empty");
				}
				if (entity instanceof ElectrobabEntity) {
					((ElectrobabEntity) entity).setAnimation("empty");
				}
				if (entity instanceof EnnardEntity) {
					((EnnardEntity) entity).setAnimation("empty");
				}
				if (entity instanceof MoltenFreddyEntity) {
					((MoltenFreddyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof ScraptrapEntity) {
					((ScraptrapEntity) entity).setAnimation("empty");
				}
				if (entity instanceof ScrapBabyEntity) {
					((ScrapBabyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof NeddbearEntity) {
					((NeddbearEntity) entity).setAnimation("empty");
				}
				if (entity instanceof MrHippoEntity) {
					((MrHippoEntity) entity).setAnimation("empty");
				}
				if (entity instanceof PigpatchEntity) {
					((PigpatchEntity) entity).setAnimation("empty");
				}
				if (entity instanceof HappyFrogEntity) {
					((HappyFrogEntity) entity).setAnimation("empty");
				}
				if (entity instanceof OrvilleElephantEntity) {
					((OrvilleElephantEntity) entity).setAnimation("empty");
				}
				if (entity instanceof LeftyEntity) {
					((LeftyEntity) entity).setAnimation("empty");
				}
				if (entity instanceof DrTeethEntity) {
					((DrTeethEntity) entity).setAnimation("empty");
				}
			}
		}
		if (entity instanceof BalloonBoyEntity || entity instanceof JJEntity) {
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty()) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player) {
							if (new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
									} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
									}
									return false;
								}
							}.checkGamemode(entityiterator) || new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayer _serverPlayer) {
										return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
									} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
										return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
												&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
									}
									return false;
								}
							}.checkGamemode(entityiterator)) {
								if (entityiterator.getPersistentData().getBoolean("hiding_mask") == true) {
									can_laugh = true;
								}
							}
						}
					}
				}
				if (can_laugh == true) {
					BBLaughLureProcedure.execute(world, x, y, z, entity);
				}
			} else {
				if (entity instanceof BalloonBoyEntity _datEntSetL)
					_datEntSetL.getEntityData().set(BalloonBoyEntity.DATA_laughing, false);
				if (entity instanceof JJEntity _datEntSetL)
					_datEntSetL.getEntityData().set(JJEntity.DATA_laughing, false);
			}
		}
	}
}
