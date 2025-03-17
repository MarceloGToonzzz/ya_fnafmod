package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FoxyStandBlockModel;
import net.mcreator.yafnafmod.block.entity.FoxyStandTileEntity;

public class FoxyStandTileRenderer extends GeoBlockRenderer<FoxyStandTileEntity> {
	public FoxyStandTileRenderer() {
		super(new FoxyStandBlockModel());
	}

	@Override
	public RenderType getRenderType(FoxyStandTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
