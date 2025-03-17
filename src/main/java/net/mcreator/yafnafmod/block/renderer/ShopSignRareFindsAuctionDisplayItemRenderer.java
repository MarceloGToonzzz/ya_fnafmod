package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignRareFindsAuctionDisplayModel;
import net.mcreator.yafnafmod.block.display.ShopSignRareFindsAuctionDisplayItem;

public class ShopSignRareFindsAuctionDisplayItemRenderer extends GeoItemRenderer<ShopSignRareFindsAuctionDisplayItem> {
	public ShopSignRareFindsAuctionDisplayItemRenderer() {
		super(new ShopSignRareFindsAuctionDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShopSignRareFindsAuctionDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
