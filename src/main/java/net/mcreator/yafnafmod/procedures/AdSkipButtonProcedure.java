package net.mcreator.yafnafmod.procedures;

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
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
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

import java.util.List;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class AdSkipButtonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean added_guy = false;
		double wawa = 0;
		{
			int _value = 1;
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
				world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			if (_bs.getBlock().getStateDefinition().getProperty("has_ad") instanceof BooleanProperty _booleanProp)
				world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("played_song", false);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound @a * ya_fnafmod:bg_adsong");
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if (entityiterator instanceof Player _plr5 && _plr5.containerMenu instanceof FiztimeSodaPopAdMenu || entityiterator instanceof Player _plr6 && _plr6.containerMenu instanceof LallysLolliesAdMenu
							|| entityiterator instanceof Player _plr7 && _plr7.containerMenu instanceof FlosFlossyFlossAdMenu || entityiterator instanceof Player _plr8 && _plr8.containerMenu instanceof WackyWartPasteAdMenu
							|| entityiterator instanceof Player _plr9 && _plr9.containerMenu instanceof MartysPlungersAdMenu || entityiterator instanceof Player _plr10 && _plr10.containerMenu instanceof ElChipAdMenu
							|| entityiterator instanceof Player _plr11 && _plr11.containerMenu instanceof PeppersPickledPopcornAdMenu) {
						if (entityiterator instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("MonitorWorkGui");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new MonitorWorkGuiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
					}
				}
			}
		}
	}
}
