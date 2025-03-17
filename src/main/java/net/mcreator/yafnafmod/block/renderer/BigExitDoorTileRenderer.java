package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigExitDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigExitDoorTileEntity;

public class BigExitDoorTileRenderer extends GeoBlockRenderer<BigExitDoorTileEntity> {
	public BigExitDoorTileRenderer() {
		super(new BigExitDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigExitDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
