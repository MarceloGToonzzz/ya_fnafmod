package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeDelilahBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FuntimeDelilahBlockTileEntity;

public class FuntimeDelilahBlockTileRenderer extends GeoBlockRenderer<FuntimeDelilahBlockTileEntity> {
	public FuntimeDelilahBlockTileRenderer() {
		super(new FuntimeDelilahBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FuntimeDelilahBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
