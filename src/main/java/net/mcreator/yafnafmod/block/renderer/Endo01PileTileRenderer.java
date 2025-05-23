package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01PileBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo01PileTileEntity;

public class Endo01PileTileRenderer extends GeoBlockRenderer<Endo01PileTileEntity> {
	public Endo01PileTileRenderer() {
		super(new Endo01PileBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01PileTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
