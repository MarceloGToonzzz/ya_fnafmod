package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxEndoBlockModel;
import net.mcreator.yafnafmod.block.entity.BoxEndoTileEntity;

public class BoxEndoTileRenderer extends GeoBlockRenderer<BoxEndoTileEntity> {
	public BoxEndoTileRenderer() {
		super(new BoxEndoBlockModel());
	}

	@Override
	public RenderType getRenderType(BoxEndoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
