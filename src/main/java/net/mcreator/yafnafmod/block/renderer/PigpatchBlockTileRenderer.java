package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PigpatchBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.PigpatchBlockTileEntity;

public class PigpatchBlockTileRenderer extends GeoBlockRenderer<PigpatchBlockTileEntity> {
	public PigpatchBlockTileRenderer() {
		super(new PigpatchBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(PigpatchBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
