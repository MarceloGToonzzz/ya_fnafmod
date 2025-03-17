package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutSpringbonnieRottenBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutSpringbonnieRottenTileEntity;

public class CutoutSpringbonnieRottenTileRenderer extends GeoBlockRenderer<CutoutSpringbonnieRottenTileEntity> {
	public CutoutSpringbonnieRottenTileRenderer() {
		super(new CutoutSpringbonnieRottenBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutSpringbonnieRottenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
