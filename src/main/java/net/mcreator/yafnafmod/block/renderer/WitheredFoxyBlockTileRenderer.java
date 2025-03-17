package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredFoxyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredFoxyBlockTileEntity;

public class WitheredFoxyBlockTileRenderer extends GeoBlockRenderer<WitheredFoxyBlockTileEntity> {
	public WitheredFoxyBlockTileRenderer() {
		super(new WitheredFoxyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredFoxyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
