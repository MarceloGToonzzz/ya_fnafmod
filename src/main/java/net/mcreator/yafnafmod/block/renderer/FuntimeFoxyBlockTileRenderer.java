package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeFoxyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FuntimeFoxyBlockTileEntity;

public class FuntimeFoxyBlockTileRenderer extends GeoBlockRenderer<FuntimeFoxyBlockTileEntity> {
	public FuntimeFoxyBlockTileRenderer() {
		super(new FuntimeFoxyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FuntimeFoxyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
