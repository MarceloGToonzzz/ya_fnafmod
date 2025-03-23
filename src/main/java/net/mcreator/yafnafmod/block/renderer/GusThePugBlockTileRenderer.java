package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GusThePugBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.GusThePugBlockTileEntity;

public class GusThePugBlockTileRenderer extends GeoBlockRenderer<GusThePugBlockTileEntity> {
	public GusThePugBlockTileRenderer() {
		super(new GusThePugBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(GusThePugBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
