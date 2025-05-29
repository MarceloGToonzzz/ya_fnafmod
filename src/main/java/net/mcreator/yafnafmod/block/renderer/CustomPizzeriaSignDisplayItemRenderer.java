package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CustomPizzeriaSignDisplayModel;
import net.mcreator.yafnafmod.block.display.CustomPizzeriaSignDisplayItem;

public class CustomPizzeriaSignDisplayItemRenderer extends GeoItemRenderer<CustomPizzeriaSignDisplayItem> {
	public CustomPizzeriaSignDisplayItemRenderer() {
		super(new CustomPizzeriaSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(CustomPizzeriaSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
