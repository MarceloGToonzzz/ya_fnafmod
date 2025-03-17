package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SinkKitchenBlockModel;
import net.mcreator.yafnafmod.block.entity.SinkKitchenTileEntity;

public class SinkKitchenTileRenderer extends GeoBlockRenderer<SinkKitchenTileEntity> {
	public SinkKitchenTileRenderer() {
		super(new SinkKitchenBlockModel());
	}

	@Override
	public RenderType getRenderType(SinkKitchenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
