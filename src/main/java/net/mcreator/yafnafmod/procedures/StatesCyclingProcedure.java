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
					|| blockstate.getBlock() == YaFnafmodModBlocks.BIG_FAN.get() || blockstate.getBlock() == YaFnafmodModBlocks.LARGE_FAN.get() || blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_GREEN.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_BLUE.get() || blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_PINK.get() || blockstate.getBlock() == YaFnafmodModBlocks.NEON_STAGE_LIGHT_ORANGE.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PROP_SIGN_OUT_OF_ORDER.get() || blockstate.getBlock() == YaFnafmodModBlocks.PROP_SIGN_MARTYS_PLUNGERS.get()
					|| blockstate.getBlock() == YaFnafmodModBlocks.PROP_SIGN_FLOS_GLOSSY_FLOSS.get() || blockstate.is(BlockTags.create(new ResourceLocation("ya_fnafmod:arcades_toggleable")))) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip87 ? blockstate.getValue(_getip87) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip90 ? blockstate.getValue(_getip90) : -1) == 1) {
					{
						int _value = 0;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
				worked = true;
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.WALL_PIZZA.get()) {
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip95 ? blockstate.getValue(_getip95) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip98 ? blockstate.getValue(_getip98) : -1) == 1) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip101 ? blockstate.getValue(_getip101) : -1) == 2) {
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
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip106 ? blockstate.getValue(_getip106) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip109 ? blockstate.getValue(_getip109) : -1) == 1) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip112 ? blockstate.getValue(_getip112) : -1) == 2) {
					{
						int _value = 3;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip115 ? blockstate.getValue(_getip115) : -1) == 3) {
					{
						int _value = 4;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip118 ? blockstate.getValue(_getip118) : -1) == 4) {
					{
						int _value = 5;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip121 ? blockstate.getValue(_getip121) : -1) == 5) {
					{
						int _value = 6;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip124 ? blockstate.getValue(_getip124) : -1) == 6) {
					{
						int _value = 7;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip127 ? blockstate.getValue(_getip127) : -1) == 7) {
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
					if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip136 ? blockstate.getValue(_getip136) : -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip139 ? blockstate.getValue(_getip139) : -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip142 ? blockstate.getValue(_getip142) : -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip145 ? blockstate.getValue(_getip145) : -1) == 3) {
						{
							int _value = 4;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip148 ? blockstate.getValue(_getip148) : -1) == 4) {
						{
							int _value = 5;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip151 ? blockstate.getValue(_getip151) : -1) == 5) {
						{
							int _value = 6;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip154 ? blockstate.getValue(_getip154) : -1) == 6) {
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
					if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip159 ? blockstate.getValue(_getip159) : -1) == 0) {
						{
							int _value = 1;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip162 ? blockstate.getValue(_getip162) : -1) == 1) {
						{
							int _value = 2;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip165 ? blockstate.getValue(_getip165) : -1) == 2) {
						{
							int _value = 3;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip168 ? blockstate.getValue(_getip168) : -1) == 3) {
						{
							int _value = 4;
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
					} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip171 ? blockstate.getValue(_getip171) : -1) == 4) {
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
				if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip176 ? blockstate.getValue(_getip176) : -1) == 0) {
					{
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip179 ? blockstate.getValue(_getip179) : -1) == 1) {
					{
						int _value = 2;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip182 ? blockstate.getValue(_getip182) : -1) == 2) {
					{
						int _value = 3;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				} else if ((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip185 ? blockstate.getValue(_getip185) : -1) == 3) {
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
