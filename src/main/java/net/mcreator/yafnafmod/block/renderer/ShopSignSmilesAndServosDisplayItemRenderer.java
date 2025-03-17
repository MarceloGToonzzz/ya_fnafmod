package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignSmilesAndServosDisplayModel;
import net.mcreator.yafnafmod.block.display.ShopSignSmilesAndServosDisplayItem;

public class ShopSignSmilesAndServosDisplayItemRenderer extends GeoItemRenderer<ShopSignSmilesAndServosDisplayItem> {
	public ShopSignSmilesAndServosDisplayItemRenderer() {
		super(new ShopSignSmilesAndServosDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShopSignSmilesAndServosDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
