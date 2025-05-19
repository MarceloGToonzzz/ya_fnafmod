package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush6BlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlush6TileEntity;

public class BoxPlush6TileRenderer extends GeoBlockRenderer<BoxPlush6TileEntity> {
	public BoxPlush6TileRenderer() {
		super(new BoxPlush6BlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush6TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
