package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorRedDisplayModel;
import net.mcreator.yafnafmod.block.display.BigBackstageDoorRedDisplayItem;

public class BigBackstageDoorRedDisplayItemRenderer extends GeoItemRenderer<BigBackstageDoorRedDisplayItem> {
	public BigBackstageDoorRedDisplayItemRenderer() {
		super(new BigBackstageDoorRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorRedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
