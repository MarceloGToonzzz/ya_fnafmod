
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AgonyItem extends Item {
	public AgonyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
