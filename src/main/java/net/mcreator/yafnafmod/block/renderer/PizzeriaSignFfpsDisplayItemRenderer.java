package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFfpsDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignFfpsDisplayItem;

public class PizzeriaSignFfpsDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignFfpsDisplayItem> {
	public PizzeriaSignFfpsDisplayItemRenderer() {
		super(new PizzeriaSignFfpsDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFfpsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
