package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StatesCyclingProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		boolean worked = false;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.FAZWRENCH.get()) {
			if (blockstate.getBlock() == YaFnafmodModBlocks.CUPCAKE.get() || blockstate.getBlock() == YaFnafmodModBlocks.TOY_CUPCAKE.get() || blockstate.getBlock() == YaFnafmodModBlocks.PHANTOM_CUPCAKE.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PARTY_BANNER_1.get() || blockstate.getBlock() == YaFnafmodModBlocks.PARTY_BANNER_2.get() || blockstate.getBlock() == YaFnafmodModBlocks.FIZTIME_BANNER.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.CAROUSEL.get() || blockstate.getBlock() == YaFnafmodModBlocks.FREDDY_STAND.get() || blockstate.getBlock() == YaFnafmodModBlocks.BONNIE_STAND.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PARTY_CHAIR.get() || blockstate.getBlock() == YaFnafmodModBlocks.SPEAKER.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_MOVIE.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_MOVIE_2.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_1988.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_1987.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_FRIGHTS.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_FREDBEARS.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_FREDBEARS_ALT.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_BABYS.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_BABYS_ALT.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_CHICAS.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_FFPS.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_FFPS_2.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_JRS.get() || blockstate.getBlock() == YaFnafmodModBlocks.PIZZERIA_SIGN_JRS_2.get() || blockstate.getBlock() == YaFnafmodModBlocks.SHOP_SIGN_DUMPSTER_DIVER.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.SHOP_SIGN_STANS_BUDGET_TECH.get() || blockstate.getBlock() == YaFnafmodModBlocks.SHOP_SIGN_SMILES_AND_SERVOS.get() || blockstate.getBlock() == YaFnafmodModBlocks.CONTROL_LADY.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.LITTLE_MAGICIAN.get() || blockstate.getBlock() == YaFnafmodModBlocks.LITTLE_JOE.get() || blockstate.getBlock() == YaFnafmodModBlocks.LITTLE_JOE_SITTING.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_GREEN.get() || blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_BLUE.get() || blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_PINK.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_ORANGE.get() || blockstate.getBlock() == YaFnafmodModBlocks.PROP_SIGN_OUT_OF_ORDER.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PROP_SIGN_MARTYS_PLUNGERS.get() || blockstate.getBlock() == YaFnafmodModBlocks.PROP_SIGN_FLOS_GLOSSY_FLOSS.get()
					|| blockstate.is(BlockTags.create(new ResourceLocation("ya_fnafmod:arcades_toggleable")))) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip83 ? blockstate.getValue(_getip83) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip86 ? blockstate.getValue(_getip86) : -1) == 1) {
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				worked = true;
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.VENT_SHAFT.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip91 ? blockstate.getValue(_getip91) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip94 ? blockstate.getValue(_getip94) : -1) == 1) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip97 ? blockstate.getValue(_getip97) : -1) == 2) {
					{
						int _value = 3;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip100 ? blockstate.getValue(_getip100) : -1) == 3) {
					{
						int _value = 4;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip103 ? blockstate.getValue(_getip103) : -1) == 4) {
					{
						int _value = 5;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip106 ? blockstate.getValue(_getip106) : -1) == 5) {
					{
						int _value = 6;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip109 ? blockstate.getValue(_getip109) : -1) == 6) {
					{
						int _value = 7;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip112 ? blockstate.getValue(_getip112) : -1) == 7) {
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				worked = true;
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.POSTER_JEFFS.get() || blockstate.getBlock() == YaFnafmodModBlocks.POSTER_FRIGHTS.get()) {
				if (blockstate.getBlock() == YaFnafmodModBlocks.POSTER_FRIGHTS.get()) {
					if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip121 ? blockstate.getValue(_getip121) : -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip124 ? blockstate.getValue(_getip124) : -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip127 ? blockstate.getValue(_getip127) : -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip130 ? blockstate.getValue(_getip130) : -1) == 3) {
						{
							int _value = 4;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip133 ? blockstate.getValue(_getip133) : -1) == 4) {
						{
							int _value = 5;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip136 ? blockstate.getValue(_getip136) : -1) == 5) {
						{
							int _value = 6;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip139 ? blockstate.getValue(_getip139) : -1) == 6) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
					worked = true;
				} else if (blockstate.getBlock() == YaFnafmodModBlocks.POSTER_JEFFS.get()) {
					if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip144 ? blockstate.getValue(_getip144) : -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip147 ? blockstate.getValue(_getip147) : -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip150 ? blockstate.getValue(_getip150) : -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip153 ? blockstate.getValue(_getip153) : -1) == 3) {
						{
							int _value = 4;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip156 ? blockstate.getValue(_getip156) : -1) == 4) {
						{
							int _value = 0;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					}
					worked = true;
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.BIG_SPEAKER.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip161 ? blockstate.getValue(_getip161) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip164 ? blockstate.getValue(_getip164) : -1) == 1) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip167 ? blockstate.getValue(_getip167) : -1) == 2) {
					{
						int _value = 3;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip170 ? blockstate.getValue(_getip170) : -1) == 3) {
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				worked = true;
			}
			if (blockstate.is(BlockTags.create(new ResourceLocation("ya_fnafmod:fazwrench_interactable"))) || worked == true) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 5);
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			}
		}
	}
}
