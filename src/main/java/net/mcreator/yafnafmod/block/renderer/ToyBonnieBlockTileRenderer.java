package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyBonnieBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyBonnieBlockTileEntity;

public class ToyBonnieBlockTileRenderer extends GeoBlockRenderer<ToyBonnieBlockTileEntity> {
	public ToyBonnieBlockTileRenderer() {
		super(new ToyBonnieBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
