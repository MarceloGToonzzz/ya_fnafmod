package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFreddyToyBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFreddyToyTileEntity;

public class CutoutFreddyToyTileRenderer extends GeoBlockRenderer<CutoutFreddyToyTileEntity> {
	public CutoutFreddyToyTileRenderer() {
		super(new CutoutFreddyToyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFreddyToyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
