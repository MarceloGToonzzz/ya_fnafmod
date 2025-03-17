package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush2BlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlush2TileEntity;

public class BoxPlush2TileRenderer extends GeoBlockRenderer<BoxPlush2TileEntity> {
	public BoxPlush2TileRenderer() {
		super(new BoxPlush2BlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
