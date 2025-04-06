
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WrenchItem extends Item {
	public WrenchItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
