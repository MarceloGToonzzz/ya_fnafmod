package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.JollyRatBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.JollyRatBlockTileEntity;

public class JollyRatBlockTileRenderer extends GeoBlockRenderer<JollyRatBlockTileEntity> {
	public JollyRatBlockTileRenderer() {
		super(new JollyRatBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(JollyRatBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
