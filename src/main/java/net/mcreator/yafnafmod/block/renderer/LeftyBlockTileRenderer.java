package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LeftyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.LeftyBlockTileEntity;

public class LeftyBlockTileRenderer extends GeoBlockRenderer<LeftyBlockTileEntity> {
	public LeftyBlockTileRenderer() {
		super(new LeftyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(LeftyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
