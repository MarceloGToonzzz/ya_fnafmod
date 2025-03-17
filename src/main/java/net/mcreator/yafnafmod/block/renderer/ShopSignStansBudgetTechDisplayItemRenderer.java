package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignStansBudgetTechDisplayModel;
import net.mcreator.yafnafmod.block.display.ShopSignStansBudgetTechDisplayItem;

public class ShopSignStansBudgetTechDisplayItemRenderer extends GeoItemRenderer<ShopSignStansBudgetTechDisplayItem> {
	public ShopSignStansBudgetTechDisplayItemRenderer() {
		super(new ShopSignStansBudgetTechDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShopSignStansBudgetTechDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
