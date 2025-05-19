package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush5BlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlush5TileEntity;

public class BoxPlush5TileRenderer extends GeoBlockRenderer<BoxPlush5TileEntity> {
	public BoxPlush5TileRenderer() {
		super(new BoxPlush5BlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush5TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
