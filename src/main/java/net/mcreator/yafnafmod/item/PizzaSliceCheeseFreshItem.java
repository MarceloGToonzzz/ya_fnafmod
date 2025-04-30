
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaSliceCheeseFreshItem extends Item {
	public PizzaSliceCheeseFreshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.8f).meat().build()));
	}
}
