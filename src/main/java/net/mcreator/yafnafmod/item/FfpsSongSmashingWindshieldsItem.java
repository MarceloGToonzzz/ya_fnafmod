
package net.mcreator.yafnafmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.List;

public class FfpsSongSmashingWindshieldsItem extends RecordItem {
	public FfpsSongSmashingWindshieldsItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:bg_fnaf6song_smashingwindshields")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 3280);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("Original by Leon Riskin, This cover done by me."));
	}
}
