package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigRentalDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigRentalDoorDisplayItem;

public class BigRentalDoorDisplayItemRenderer extends GeoItemRenderer<BigRentalDoorDisplayItem> {
	public BigRentalDoorDisplayItemRenderer() {
		super(new BigRentalDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigRentalDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
