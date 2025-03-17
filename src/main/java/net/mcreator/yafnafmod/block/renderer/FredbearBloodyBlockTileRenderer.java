package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearBloodyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FredbearBloodyBlockTileEntity;

public class FredbearBloodyBlockTileRenderer extends GeoBlockRenderer<FredbearBloodyBlockTileEntity> {
	public FredbearBloodyBlockTileRenderer() {
		super(new FredbearBloodyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearBloodyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
