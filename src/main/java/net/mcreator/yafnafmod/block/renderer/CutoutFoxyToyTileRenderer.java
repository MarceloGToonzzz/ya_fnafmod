package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFoxyToyBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFoxyToyTileEntity;

public class CutoutFoxyToyTileRenderer extends GeoBlockRenderer<CutoutFoxyToyTileEntity> {
	public CutoutFoxyToyTileRenderer() {
		super(new CutoutFoxyToyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFoxyToyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
