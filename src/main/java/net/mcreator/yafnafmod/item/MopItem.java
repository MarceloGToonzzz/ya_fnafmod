
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MopItem extends Item {
	public MopItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
