package net.mcreator.yafnafmod.init;

import software.bernie.geckolib.animatable.GeoItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;

import net.mcreator.yafnafmod.item.ShotgunItem;
import net.mcreator.yafnafmod.item.RatItemItem;
import net.mcreator.yafnafmod.item.PopgunRevolverItem;
import net.mcreator.yafnafmod.item.MegaphoneItem;

@Mod.EventBusSubscriber
public class ItemAnimationFactory {
	@SubscribeEvent
	public static void animatedItems(TickEvent.PlayerTickEvent event) {
		String animation = "";
		ItemStack mainhandItem = event.player.getMainHandItem().copy();
		ItemStack offhandItem = event.player.getOffhandItem().copy();
		if (event.phase == TickEvent.Phase.START && (mainhandItem.getItem() instanceof GeoItem || offhandItem.getItem() instanceof GeoItem)) {
			if (mainhandItem.getItem() instanceof MegaphoneItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((MegaphoneItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof MegaphoneItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((MegaphoneItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof RatItemItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((RatItemItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof RatItemItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((RatItemItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof ShotgunItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((ShotgunItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof ShotgunItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((ShotgunItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (mainhandItem.getItem() instanceof PopgunRevolverItem animatable) {
				animation = mainhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getMainHandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((PopgunRevolverItem) event.player.getMainHandItem().getItem()).animationprocedure = animation;
					}
				}
			}
			if (offhandItem.getItem() instanceof PopgunRevolverItem animatable) {
				animation = offhandItem.getOrCreateTag().getString("geckoAnim");
				if (!animation.isEmpty()) {
					event.player.getOffhandItem().getOrCreateTag().putString("geckoAnim", "");
					if (event.player.level().isClientSide()) {
						((PopgunRevolverItem) event.player.getOffhandItem().getItem()).animationprocedure = animation;
					}
				}
			}
		}
	}
}
