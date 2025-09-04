
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SkinChangerToolItem extends Item {
	public SkinChangerToolItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
