package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignKitchenBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonSignKitchenTileEntity;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class NeonSignKitchenTileRenderer extends GeoBlockRenderer<NeonSignKitchenTileEntity> {
	public NeonSignKitchenTileRenderer() {
		super(new NeonSignKitchenBlockModel());
		this.addRenderLayer(new AutoGlowingGeoLayer<>(this));
	}

	@Override
	public RenderType getRenderType(NeonSignKitchenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
