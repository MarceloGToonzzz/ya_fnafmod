package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigRentalDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigRentalDoorTileEntity;

public class BigRentalDoorTileRenderer extends GeoBlockRenderer<BigRentalDoorTileEntity> {
	public BigRentalDoorTileRenderer() {
		super(new BigRentalDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigRentalDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
