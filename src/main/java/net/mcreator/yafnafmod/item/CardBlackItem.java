
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CardBlackItem extends Item {
	public CardBlackItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
