package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class RascRemoteDataProcedure {
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
		if (itemstack.getItem() == YaFnafmodModItems.RASC_REMOTE.get()) {
			if (!(itemstack.getOrCreateTag().getString("connected_rasc")).equals("")) {
				tooltip.add(Component.literal("Right click to use the RASC's audio lure, shift right click to bring it to you!"));
				if (((ItemTooltipEvent) event).getFlags().isAdvanced()) {
					tooltip.add(1, Component.literal(("Connected Rasc: " + itemstack.getOrCreateTag().getString("connected_rasc"))));
				}
			} else {
				tooltip.add(Component.literal("Right click a RASC block to turn it on, then right click it again to link it to your remote."));
			}
		}
	}
}
