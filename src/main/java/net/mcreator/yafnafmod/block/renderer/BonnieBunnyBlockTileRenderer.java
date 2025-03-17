package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonnieBunnyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BonnieBunnyBlockTileEntity;

public class BonnieBunnyBlockTileRenderer extends GeoBlockRenderer<BonnieBunnyBlockTileEntity> {
	public BonnieBunnyBlockTileRenderer() {
		super(new BonnieBunnyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnieBunnyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
