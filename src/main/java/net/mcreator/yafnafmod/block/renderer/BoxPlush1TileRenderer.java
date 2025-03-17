package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush1BlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlush1TileEntity;

public class BoxPlush1TileRenderer extends GeoBlockRenderer<BoxPlush1TileEntity> {
	public BoxPlush1TileRenderer() {
		super(new BoxPlush1BlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
