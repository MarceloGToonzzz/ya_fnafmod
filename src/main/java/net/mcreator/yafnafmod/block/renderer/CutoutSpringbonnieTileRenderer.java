package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutSpringbonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutSpringbonnieTileEntity;

public class CutoutSpringbonnieTileRenderer extends GeoBlockRenderer<CutoutSpringbonnieTileEntity> {
	public CutoutSpringbonnieTileRenderer() {
		super(new CutoutSpringbonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutSpringbonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
