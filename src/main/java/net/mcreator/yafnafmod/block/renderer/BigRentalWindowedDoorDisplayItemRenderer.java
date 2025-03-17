package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigRentalWindowedDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigRentalWindowedDoorDisplayItem;

public class BigRentalWindowedDoorDisplayItemRenderer extends GeoItemRenderer<BigRentalWindowedDoorDisplayItem> {
	public BigRentalWindowedDoorDisplayItemRenderer() {
		super(new BigRentalWindowedDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigRentalWindowedDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
