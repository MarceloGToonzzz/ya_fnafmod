package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BaggieMaggieBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BaggieMaggieBlockTileEntity;

public class BaggieMaggieBlockTileRenderer extends GeoBlockRenderer<BaggieMaggieBlockTileEntity> {
	public BaggieMaggieBlockTileRenderer() {
		super(new BaggieMaggieBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BaggieMaggieBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
