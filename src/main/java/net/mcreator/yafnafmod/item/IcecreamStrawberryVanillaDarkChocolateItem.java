
package net.mcreator.yafnafmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class IcecreamStrawberryVanillaDarkChocolateItem extends Item {
	public IcecreamStrawberryVanillaDarkChocolateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.6f).alwaysEat().build()));
	}
}
