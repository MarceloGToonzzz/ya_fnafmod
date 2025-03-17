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
public class KeyTooltipThingProcedure {
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
		if (itemstack.getItem() == YaFnafmodModItems.KEY.get()) {
			if (itemstack.getOrCreateTag().getBoolean("doorlinked") == true) {
				tooltip.add(1, Component.literal(("\u00A7eLinked to door at: " + (itemstack.getOrCreateTag().getDouble("door_x") + " " + itemstack.getOrCreateTag().getDouble("door_y") + " " + itemstack.getOrCreateTag().getDouble("door_z")))));
			}
		}
	}
}
