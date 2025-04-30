
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaSliceRalphFreshItem extends Item {
	public PizzaSliceRalphFreshItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(15).saturationMod(1.2f).meat().build()));
	}
}
