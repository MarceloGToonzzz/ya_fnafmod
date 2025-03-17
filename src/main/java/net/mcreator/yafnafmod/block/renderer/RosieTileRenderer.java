package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RosieBlockModel;
import net.mcreator.yafnafmod.block.entity.RosieTileEntity;

public class RosieTileRenderer extends GeoBlockRenderer<RosieTileEntity> {
	public RosieTileRenderer() {
		super(new RosieBlockModel());
	}

	@Override
	public RenderType getRenderType(RosieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
