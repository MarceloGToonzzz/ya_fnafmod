package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonnetBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BonnetBlockTileEntity;

public class BonnetBlockTileRenderer extends GeoBlockRenderer<BonnetBlockTileEntity> {
	public BonnetBlockTileRenderer() {
		super(new BonnetBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnetBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
