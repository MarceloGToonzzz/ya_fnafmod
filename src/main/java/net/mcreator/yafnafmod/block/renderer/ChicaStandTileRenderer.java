package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ChicaStandBlockModel;
import net.mcreator.yafnafmod.block.entity.ChicaStandTileEntity;

public class ChicaStandTileRenderer extends GeoBlockRenderer<ChicaStandTileEntity> {
	public ChicaStandTileRenderer() {
		super(new ChicaStandBlockModel());
	}

	@Override
	public RenderType getRenderType(ChicaStandTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
