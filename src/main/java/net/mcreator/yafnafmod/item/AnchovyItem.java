
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AnchovyItem extends Item {
	public AnchovyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
