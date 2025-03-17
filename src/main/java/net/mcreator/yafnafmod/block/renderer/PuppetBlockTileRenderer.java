package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PuppetBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.PuppetBlockTileEntity;

public class PuppetBlockTileRenderer extends GeoBlockRenderer<PuppetBlockTileEntity> {
	public PuppetBlockTileRenderer() {
		super(new PuppetBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(PuppetBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
