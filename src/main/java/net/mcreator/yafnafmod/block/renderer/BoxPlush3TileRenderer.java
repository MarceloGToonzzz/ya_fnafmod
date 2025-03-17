package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlush3BlockModel;
import net.mcreator.yafnafmod.block.entity.BoxPlush3TileEntity;

public class BoxPlush3TileRenderer extends GeoBlockRenderer<BoxPlush3TileEntity> {
	public BoxPlush3TileRenderer() {
		super(new BoxPlush3BlockModel());
	}

	@Override
	public RenderType getRenderType(BoxPlush3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
