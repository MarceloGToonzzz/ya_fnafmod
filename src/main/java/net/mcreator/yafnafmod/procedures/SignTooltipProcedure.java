package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class SignTooltipProcedure {
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
		if (!(itemstack.getItem() == YaFnafmodModBlocks.CUSTOM_PIZZERIA_SIGN.get().asItem())) {
			if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("ya_fnafmod:")
					&& ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("pizzeria_sign") || (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("shop_sign"))) {
				tooltip.add(1, Component.literal("- Right click with Faz-Wrench to off-center!"));
				tooltip.add(2, Component.literal("- Activate with Redstone to turn on the light!"));
			}
		} else {
			tooltip.add(1, Component.literal("- Right click with Faz-Wrench to change texture!"));
			tooltip.add(2, Component.literal(("- Right click with FAT (Red Mode) to change text!" + "\n" + "Or alternatively, right click and sneak right click with name tags, and use dye to color!")));
		}
	}
}
