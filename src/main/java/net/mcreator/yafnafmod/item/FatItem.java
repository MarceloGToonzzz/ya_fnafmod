
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
		list.add(Component.literal("\u00A7eFAT/Fazbear Assistance Panel (Copyright 1987)"));
		list.add(Component.literal("Sneak + Right Click to change modes."));
		list.add(Component.literal("\u00A7aGreen Mode - Animatronic Block Animator"));
		list.add(Component.literal("\u00A79Blue Mode - Animatronic Block Style Changer"));
		list.add(Component.literal("\u00A7cRed Mode - Letter Sign Block Editor"));
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
