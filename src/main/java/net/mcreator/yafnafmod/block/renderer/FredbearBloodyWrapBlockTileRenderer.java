package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearBloodyWrapBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FredbearBloodyWrapBlockTileEntity;

public class FredbearBloodyWrapBlockTileRenderer extends GeoBlockRenderer<FredbearBloodyWrapBlockTileEntity> {
	public FredbearBloodyWrapBlockTileRenderer() {
		super(new FredbearBloodyWrapBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearBloodyWrapBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
