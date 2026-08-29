package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignRestroomBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonSignRestroomTileEntity;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class NeonSignRestroomTileRenderer extends GeoBlockRenderer<NeonSignRestroomTileEntity> {
	public NeonSignRestroomTileRenderer() {
		super(new NeonSignRestroomBlockModel());
		this.addRenderLayer(new AutoGlowingGeoLayer<>(this));
	}

	@Override
	public RenderType getRenderType(NeonSignRestroomTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
