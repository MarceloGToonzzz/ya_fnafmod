package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignRareFindsAuctionBlockModel;
import net.mcreator.yafnafmod.block.entity.ShopSignRareFindsAuctionTileEntity;

public class ShopSignRareFindsAuctionTileRenderer extends GeoBlockRenderer<ShopSignRareFindsAuctionTileEntity> {
	public ShopSignRareFindsAuctionTileRenderer() {
		super(new ShopSignRareFindsAuctionBlockModel());
	}

	@Override
	public RenderType getRenderType(ShopSignRareFindsAuctionTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
