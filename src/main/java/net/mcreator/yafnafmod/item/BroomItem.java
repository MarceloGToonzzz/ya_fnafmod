
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BroomItem extends Item {
	public BroomItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
