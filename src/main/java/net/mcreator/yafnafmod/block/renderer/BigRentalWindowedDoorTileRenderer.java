package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigRentalWindowedDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigRentalWindowedDoorTileEntity;

public class BigRentalWindowedDoorTileRenderer extends GeoBlockRenderer<BigRentalWindowedDoorTileEntity> {
	public BigRentalWindowedDoorTileRenderer() {
		super(new BigRentalWindowedDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigRentalWindowedDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
