
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HamburgerItem extends Item {
	public HamburgerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(15).saturationMod(1.5f).meat().build()));
	}
}
