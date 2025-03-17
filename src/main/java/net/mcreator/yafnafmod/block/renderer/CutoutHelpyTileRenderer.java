package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutHelpyBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutHelpyTileEntity;

public class CutoutHelpyTileRenderer extends GeoBlockRenderer<CutoutHelpyTileEntity> {
	public CutoutHelpyTileRenderer() {
		super(new CutoutHelpyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutHelpyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
