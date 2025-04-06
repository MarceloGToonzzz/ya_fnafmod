package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class AnimatedBlocksTooltipsProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		ItemStack wawa = ItemStack.EMPTY;
		if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("ya_fnafmod:")) {
			if ((itemstack.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).is(BlockTags.create(new ResourceLocation("ya_fnafmod:tooltip_animatable")))) {
				tooltip.add(1, Component.literal("- Right click with Faz-Wrench to animate!"));
			} else if ((itemstack.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).is(BlockTags.create(new ResourceLocation("ya_fnafmod:tooltip_diagonal")))) {
				tooltip.add(1, Component.literal("- Right click with Faz-Wrench to make it diagonal!"));
			} else if ((itemstack.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).is(BlockTags.create(new ResourceLocation("ya_fnafmod:tooltip_rotational")))) {
				tooltip.add(1, Component.literal("- Right click with Faz-Wrench to rotate it!!"));
			} else if ((itemstack.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState()).is(BlockTags.create(new ResourceLocation("ya_fnafmod:tooltip_openclose")))) {
				if (!(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("fridge")) {
					tooltip.add(1, Component.literal("- Right click to open and close!"));
				} else {
					tooltip.add(1, Component.literal("- Shift-Right click to open and close! Then right click it to open the inventory!"));
				}
			}
			if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).equals("ya_fnafmod:old_man_consequences_block")) {
				tooltip.add(1, Component.literal("(Also known as OMC)"));
			}
			if (itemstack.getItem() == YaFnafmodModBlocks.OFFICE_CHAIR_RED.get().asItem()) {
				tooltip.add(1, Component.literal("\u00A7cRed"));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.OFFICE_CHAIR_BLACK.get().asItem()) {
				tooltip.add(1, Component.literal("\u00A79Black"));
			}
			if (itemstack.getItem() == YaFnafmodModBlocks.BIG_ELEVATOR_DOOR.get().asItem()) {
				tooltip.add(1, Component.literal("- Needs to be linked to a Elevator Button using the Faz-Wrench"));
			}
			if (itemstack.getItem() == YaFnafmodModBlocks.BALLPIT_ROTTEN.get().asItem()) {
				tooltip.add(1, Component.literal("\u00A72Rotten"));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.BALLPIT_VINTAGE.get().asItem()) {
				tooltip.add(1, Component.literal("\u00A76Vintage"));
			}
			if (itemstack.getItem() == YaFnafmodModBlocks.BALLPIT_ROTTEN.get().asItem()) {
				tooltip.add(1, Component.literal("\u00A72Rotten"));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.BALLPIT_VINTAGE.get().asItem()) {
				tooltip.add(1, Component.literal("\u00A76Vintage"));
			}
			if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("stage_light")
					|| (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("big") && (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("door")) {
				if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("red")) {
					tooltip.add(1, Component.literal("\u00A7cRed"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("orange")) {
					tooltip.add(1, Component.literal("\u00A76Orange"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("yellow")) {
					tooltip.add(1, Component.literal("\u00A7eYellow"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("green")) {
					tooltip.add(1, Component.literal("\u00A72Green"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("light_blue")) {
					tooltip.add(1, Component.literal("\u00A7bLight Blue"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("blue") && !(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("light_blue")) {
					tooltip.add(1, Component.literal("\u00A79Blue"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("purple")) {
					tooltip.add(1, Component.literal("\u00A75Purple"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("magenta")) {
					tooltip.add(1, Component.literal("\u00A7dMagenta"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("pink")) {
					tooltip.add(1, Component.literal("\u00A7dPink"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("white")) {
					tooltip.add(1, Component.literal("White"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("gray")) {
					tooltip.add(1, Component.literal("\u00A77Gray"));
				} else if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("black")) {
					tooltip.add(1, Component.literal("\u00A79Black"));
				}
			}
			if (itemstack.getItem() == YaFnafmodModBlocks.CANDY_CADET.get().asItem()) {
				tooltip.add(1, Component.literal("- Right click with a quarter and get some candy!"));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.NEON_JUKEBOX.get().asItem()) {
				tooltip.add(1, Component.literal("- Right click with FAT to turn on, then right click without it to cycle songs."));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.DISCOUNT_COOLING_UNIT.get().asItem()) {
				tooltip.add(1, Component.literal("- Right click when its redstone activated to turn it on!"));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.BULLETIN_BOARD.get().asItem()) {
				tooltip.add(1, Component.literal("- Right click with Faz-Wrench to fill with paper!"));
			} else if (itemstack.getItem() == YaFnafmodModBlocks.CONTROL_PANEL.get().asItem()) {
				tooltip.add(1, Component.literal("- Can connect to Linked Lamps and Control Shock Infusers"));
				tooltip.add(1, Component.literal("= Right Click to use Linked Lamps"));
				tooltip.add(1, Component.literal("= Shift Right Click to use Controlled Shocks"));
			}
			if (itemstack.getItem() == YaFnafmodModBlocks.GRANDFATHER_CLOCK.get().asItem()) {
				tooltip.add(1, Component.literal("- Right click to see the current time!"));
				tooltip.add(2, Component.literal("- Plays a tune when it turns 6:00 AM! (Right click with Faz-Wrench to change tune!)"));
				tooltip.add(3, Component.literal("- Plays a chime when it turns midnight!"));
			}
		}
	}
}
