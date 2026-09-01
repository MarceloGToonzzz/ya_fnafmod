package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import javax.annotation.Nullable;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ArcadeInteractProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(BlockState blockstate, Entity entity) {
		execute(null, blockstate, entity);
	}

	private static void execute(@Nullable Event event, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		boolean yay = false;
		List<Object> gumballs = new ArrayList<>();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == YaFnafmodModItems.QUARTER.get()
				&& !(entity instanceof Player _plrCldCheck3 && _plrCldCheck3.getCooldowns().isOnCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()))) {
			if (blockstate.getBlock() == YaFnafmodModBlocks.PRIZE_KING.get()) {
				yay = true;
				rand = Mth.nextInt(RandomSource.create(), 1, 3);
				if (rand == 2) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(YaFnafmodModItems.FAZCOIN.get()).copy();
						_setstack.setCount((int) (Mth.nextInt(RandomSource.create(), 1, 3) * 5));
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Better luck next time!"), true);
				}
			} else if (blockstate.getBlock() == YaFnafmodModBlocks.GUMBALL_SWIVELHANDS.get()) {
				yay = true;
				rand = Mth.nextInt(RandomSource.create(), 1, 5);
				if (rand == 1) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(YaFnafmodModItems.RED_GUMBALL.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (rand == 2) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(YaFnafmodModItems.YELLOW_GUMBALL.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (rand == 3) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(YaFnafmodModItems.GREEN_GUMBALL.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (rand == 4) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(YaFnafmodModItems.BLUE_GUMBALL.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else if (rand == 5) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(YaFnafmodModItems.PURPLE_GUMBALL.get()).copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (yay == true) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(YaFnafmodModItems.QUARTER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem(), 5);
			}
		}
	}
}
