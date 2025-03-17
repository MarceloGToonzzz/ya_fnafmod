package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFoxyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyFoxyBlockTileEntity;

public class ToyFoxyBlockTileRenderer extends GeoBlockRenderer<ToyFoxyBlockTileEntity> {
	public ToyFoxyBlockTileRenderer() {
		super(new ToyFoxyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFoxyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
