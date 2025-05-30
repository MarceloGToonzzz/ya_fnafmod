package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.world.inventory.WackyWartPasteAdMenu;
import net.mcreator.yafnafmod.world.inventory.PeppersPickledPopcornAdMenu;
import net.mcreator.yafnafmod.world.inventory.MonitorWorkGuiMenu;
import net.mcreator.yafnafmod.world.inventory.MartysPlungersAdMenu;
import net.mcreator.yafnafmod.world.inventory.LallysLolliesAdMenu;
import net.mcreator.yafnafmod.world.inventory.FlosFlossyFlossAdMenu;
import net.mcreator.yafnafmod.world.inventory.FiztimeSodaPopAdMenu;
import net.mcreator.yafnafmod.world.inventory.ElChipAdMenu;
import net.mcreator.yafnafmod.entity.ElChipEntity;

import java.util.List;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class MonitorWorkOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double chance = 0;
		double Ad = 0;
		if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 1) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("monitor_tick", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "monitor_tick") + 5));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "monitor_tick") > 300) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("monitor_tick", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				chance = Mth.nextInt(RandomSource.create(), 1, 7);
				if (chance == 3) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("music_tick", 0);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					Ad = Mth.nextInt(RandomSource.create(), 2, 7);
					{
						int _value = (int) Ad;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("has_ad") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:bg_adsong")), SoundSource.NEUTRAL, 1, 1);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("played_song", true);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof Player) {
								if (entityiterator instanceof Player _plr16 && _plr16.containerMenu instanceof MonitorWorkGuiMenu) {
									if (Ad == 2) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("FiztimeSodaPopAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new FiztimeSodaPopAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									} else if (Ad == 3) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("FlosFlossyFlossAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new FlosFlossyFlossAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									} else if (Ad == 4) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("LallysLolliesAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new LallysLolliesAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									} else if (Ad == 5) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("MartysPlungersAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new MartysPlungersAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									} else if (Ad == 6) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("PeppersPickledPopcornAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new PeppersPickledPopcornAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									} else if (Ad == 7) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("WackyWartPasteAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new WackyWartPasteAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									} else if (Ad == 8) {
										if (entityiterator instanceof ServerPlayer _ent) {
											BlockPos _bpos = BlockPos.containing(x, y, z);
											NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
												@Override
												public Component getDisplayName() {
													return Component.literal("ElChipAd");
												}

												@Override
												public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
													return new ElChipAdMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
												}
											}, _bpos);
										}
									}
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ElChipEntity) {
						if ((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getBoolean(tag);
								return false;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "played_song")) == false) {
							if (world instanceof Level)
								((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:bg_adsong")), SoundSource.RECORDS, 1, 1);
							if (!world.isClientSide()) {
								BlockPos _bp = BlockPos.containing(x, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putBoolean("played_song", true);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
						{
							int _value = 8;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						if (entityiterator instanceof Mob) {
							try {
								((Mob) entityiterator).setTarget(null);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						if (entityiterator instanceof Mob _entity)
							_entity.getNavigation().moveTo((entityiterator.getPersistentData().getDouble("x")), (entityiterator.getPersistentData().getDouble("y")), (entityiterator.getPersistentData().getDouble("z")), 2);
					}
				}
			}
		} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip37 ? blockstate.getValue(_getip37) : -1) != 1
				&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip39 ? blockstate.getValue(_getip39) : -1) != 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("music_tick", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, BlockPos.containing(x, y, z), "music_tick") + 5));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "music_tick") == 1255) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"stopsound @a * ya_fnafmod:bg_adsong");
				if (world instanceof Level)
					((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:bg_adsong")), SoundSource.RECORDS, 1, 1);
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:animatronics"))) && !(entityiterator instanceof ElChipEntity)
							|| entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:animatronics")))
									&& (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip51 ? blockstate.getValue(_getip51) : -1) != 8)
							&& new Vec3(x, y, z).distanceTo(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))) > 3) {
						if (entityiterator instanceof Mob _entity)
							_entity.getNavigation().moveTo(x, y, z, 1.25);
					}
				}
			}
		}
	}
}
