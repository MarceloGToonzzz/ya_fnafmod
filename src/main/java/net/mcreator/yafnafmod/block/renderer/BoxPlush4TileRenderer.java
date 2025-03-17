package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush4BlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlush4TileEntity;

public class BoxPlush4TileRenderer extends GeoBlockRenderer<BoxPlush4TileEntity> {
	public BoxPlush4TileRenderer() {
		super(new BoxPlush4BlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush4TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
