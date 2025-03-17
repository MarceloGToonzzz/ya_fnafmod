package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BlockItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class AnimatronicBlockTooltipProcedure {
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
		double cur_pos = 0;
		BlockState theblock = Blocks.AIR.defaultBlockState();
		boolean do_sound = false;
		theblock = (itemstack.getItem() instanceof BlockItem _bi ? _bi.getBlock().defaultBlockState() : Blocks.AIR.defaultBlockState());
		if (theblock.is(BlockTags.create(new ResourceLocation("ya_fnafmod:animatronic_blocks")))) {
			cur_pos = 1;
			if (CheckIfHasAnimationProcedure.execute(theblock) == true) {
				tooltip.add((int) cur_pos, Component.literal("\u00A7a- Right Click with F.A.T (Green Screen) to make move."));
				cur_pos = cur_pos + 1;
			}
			tooltip.add((int) cur_pos, Component.literal("\u00A79- Right click with the F.A.T (Blue Screen) to change styles"));
		}
	}
}
