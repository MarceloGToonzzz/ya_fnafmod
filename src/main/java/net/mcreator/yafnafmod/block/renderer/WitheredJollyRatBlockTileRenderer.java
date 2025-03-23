package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredJollyRatBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredJollyRatBlockTileEntity;

public class WitheredJollyRatBlockTileRenderer extends GeoBlockRenderer<WitheredJollyRatBlockTileEntity> {
	public WitheredJollyRatBlockTileRenderer() {
		super(new WitheredJollyRatBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredJollyRatBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
