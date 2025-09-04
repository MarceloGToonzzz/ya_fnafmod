package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class SpecialInfoProcedureProcedure {
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
		String entity_registry = "";
		String final_thing = "";
		String wubawuba = "";
		if ((ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("spawn_item") && !(ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("car")
				&& (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).contains("ya_fnafmod:")) {
			cur_pos = 1;
			entity_registry = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("_spawn_item", "");
			final_thing = "";
			wubawuba = "\u00A7l";
			if (entity_registry.contains("walker")) {
				tooltip.add((int) cur_pos, Component.literal("\u00A7lWALKS DURING THE NIGHT"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_dayinvisible")))) {
				tooltip.add((int) cur_pos, Component.literal("\u00A7lONLY VISIBLE DURING THE NIGHT!"));
				cur_pos = cur_pos + 1;
			} else if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_nightdisappear")))) {
				tooltip.add((int) cur_pos, Component.literal("\u00A7lDESPAWNS DURING DAYTIME"));
				cur_pos = cur_pos + 1;
			}
			if (entity_registry.contains(":yenndo")) {
				tooltip.add((int) cur_pos, Component.literal("- Only moves when you're not looking."));
				cur_pos = cur_pos + 1;
			}
			if (entity_registry.contains(":funtime_chica")) {
				tooltip.add((int) cur_pos, Component.literal("- Don't let her distract you!"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_dontlook")))) {
				tooltip.add((int) cur_pos, Component.literal("- Don't look at them! They will damage you!"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_mask_foolers")))) {
				tooltip.add((int) cur_pos, Component.literal("- Fooled by the Freddy Mask!"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_audiolure")))) {
				tooltip.add((int) cur_pos, Component.literal("- Distracted by Audio Lures!"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_ventcrawler")))) {
				tooltip.add((int) cur_pos, Component.literal("- Crawls through vents!"));
				cur_pos = cur_pos + 1;
			}
			if (entity_registry.contains("funtime_freddy")) {
				tooltip.add((int) cur_pos, Component.literal("- Can throw Bonbon when he sees you!"));
				cur_pos = cur_pos + 1;
			} else if (entity_registry.contains("ballora")) {
				tooltip.add((int) cur_pos, Component.literal("- Doesn't see you, so she won't attack you."));
				cur_pos = cur_pos + 1;
				tooltip.add((int) cur_pos, Component.literal("- Lured by Minireenas."));
				cur_pos = cur_pos + 1;
			} else if (entity_registry.contains("rockstar_freddy_walker")) {
				tooltip.add((int) cur_pos, Component.literal("- When he wakes up, give him 5 Fazcoins to make him go to sleep!"));
				cur_pos = cur_pos + 1;
			} else if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_musicbox")))) {
				tooltip.add((int) cur_pos, Component.literal("- Use the Music Box to lure her to it! Make sure to keep it wound up though!"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_flashlightweak")))) {
				tooltip.add((int) cur_pos, Component.literal("- Weak to the flashlight and flashbeacon!"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_fuseboxdisable")))) {
				tooltip.add((int) cur_pos, Component.literal("- Disables the fusebox"));
				cur_pos = cur_pos + 1;
			}
			if (itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:spawnitem_door_disabler")))) {
				tooltip.add((int) cur_pos, Component.literal("- Disables security doors"));
				cur_pos = cur_pos + 1;
			}
			if (entity_registry.contains("minireena") && !entity_registry.contains("2")) {
				tooltip.add((int) cur_pos, Component.literal("- Lures Ballora!"));
				cur_pos = cur_pos + 1;
			}
			if ((entity_registry.contains("balloon_boy") || entity_registry.contains("jj")) && !entity_registry.contains("phantom")) {
				tooltip.add((int) cur_pos, Component.literal("- Lures animatronics!"));
				cur_pos = cur_pos + 1;
			}
			if (!(final_thing).isEmpty()) {
				final_thing = final_thing + " \\n ";
			}
		}
	}
}
