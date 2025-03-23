package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.JjBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.JjBlockTileEntity;

public class JjBlockTileRenderer extends GeoBlockRenderer<JjBlockTileEntity> {
	public JjBlockTileRenderer() {
		super(new JjBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(JjBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
