package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BucketBobBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BucketBobBlockTileEntity;

public class BucketBobBlockTileRenderer extends GeoBlockRenderer<BucketBobBlockTileEntity> {
	public BucketBobBlockTileRenderer() {
		super(new BucketBobBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BucketBobBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
