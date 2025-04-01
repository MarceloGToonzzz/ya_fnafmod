
package net.mcreator.yafnafmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.procedures.FatRightclickedProcedure;
import net.mcreator.yafnafmod.procedures.FatRightClickedUiProcedure;

import java.util.List;

public class FatItem extends Item {
	public FatItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.ya_fnafmod.fat.description_0"));
		list.add(Component.translatable("item.ya_fnafmod.fat.description_1"));
		list.add(Component.translatable("item.ya_fnafmod.fat.description_2"));
		list.add(Component.translatable("item.ya_fnafmod.fat.description_3"));
		list.add(Component.translatable("item.ya_fnafmod.fat.description_4"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FatRightClickedUiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		return FatRightclickedProcedure.execute(context.getPlayer(), context.getItemInHand());
	}
}
