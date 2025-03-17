package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.world.inventory.FridgeIndustrialGUIMenu;
import net.mcreator.yafnafmod.world.inventory.FridgeGUIMenu;
import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import io.netty.buffer.Unpooled;

public class AnimationStateCyclingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		boolean done = false;
		Direction thing = Direction.NORTH;
		thing = new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate);
		if (done == false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FAZWRENCH.get() || blockstate.getBlock() == YaFnafmodModBlocks.DUMPSTER_GREEN.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.DUMPSTER_BLUE.get() || blockstate.getBlock() == YaFnafmodModBlocks.LAPTOP_OLD.get() || blockstate.getBlock() == YaFnafmodModBlocks.LAPTOP.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.BATHROOM_STALL.get()
					|| (blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_WHITE.get() || blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_GRAY.get() || blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_INDUSTRIAL.get())
							&& entity.isShiftKeyDown()) {
				if (!(blockstate.getBlock() == YaFnafmodModBlocks.MEDICAL_STATION.get()) && !(blockstate.getBlock() == YaFnafmodModBlocks.CAMERA.get())) {
					if (!(entity instanceof Player _plrCldCheck26 && _plrCldCheck26.getCooldowns().isOnCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()))) {
						if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _getip28
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip28)
								: -1) == 0) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("setblock ~ ~ ~ REGISTRY[animation=1]".replace("REGISTRY", ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())));
							if (blockstate.getBlock() == YaFnafmodModBlocks.BATHROOM_STALL.get()) {
								{
									int _value = 1;
									BlockPos _pos = BlockPos.containing(x, y, z);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
										world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("setblock ~ ~ ~ REGISTRY[animation=0]".replace("REGISTRY", ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())));
							if (blockstate.getBlock() == YaFnafmodModBlocks.BATHROOM_STALL.get()) {
								{
									int _value = 0;
									BlockPos _pos = BlockPos.containing(x, y, z);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
										world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
								}
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 5);
						{
							Direction _dir = thing;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				} else if (blockstate.getBlock() == YaFnafmodModBlocks.CAMERA.get()) {
					if (!(entity instanceof Player _plrCldCheck48 && _plrCldCheck48.getCooldowns().isOnCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()))) {
						if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _getip50
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip50)
								: -1) == 0) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("setblock ~ ~ ~ REGISTRY[animation=1]".replace("REGISTRY", ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())));
						} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _getip55
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip55)
								: -1) == 1) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("setblock ~ ~ ~ REGISTRY[animation=2]".replace("REGISTRY", ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())));
						} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _getip60
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip60)
								: -1) == 2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("setblock ~ ~ ~ REGISTRY[animation=3]".replace("REGISTRY", ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())));
						} else if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _getip65
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip65)
								: -1) == 3) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("setblock ~ ~ ~ REGISTRY[animation=0]".replace("REGISTRY", ForgeRegistries.BLOCKS.getKey(blockstate.getBlock()).toString())));
						}
						if (entity instanceof LivingEntity _entity)
							_entity.swing(InteractionHand.MAIN_HAND, true);
						if (entity instanceof Player _player)
							_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 5);
						{
							Direction _dir = thing;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
					}
				}
			} else if ((blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_WHITE.get() || blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_GRAY.get() || blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_INDUSTRIAL.get())
					&& !entity.isShiftKeyDown()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _getip81 ? blockstate.getValue(_getip81) : -1) == 1) {
					if (blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_WHITE.get() || blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_GRAY.get()) {
						if (entity instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("FridgeGUI");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new FridgeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
					} else if (blockstate.getBlock() == YaFnafmodModBlocks.FRIDGE_INDUSTRIAL.get()) {
						if (entity instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("FridgeIndustrialGUI");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new FridgeIndustrialGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
					}
				}
			} else {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip91 ? blockstate.getValue(_getip91) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else {
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
			done = true;
		}
	}
}
