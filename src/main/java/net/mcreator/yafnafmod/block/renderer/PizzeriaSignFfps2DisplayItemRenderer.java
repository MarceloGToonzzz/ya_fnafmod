package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFfps2DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignFfps2DisplayItem;

public class PizzeriaSignFfps2DisplayItemRenderer extends GeoItemRenderer<PizzeriaSignFfps2DisplayItem> {
	public PizzeriaSignFfps2DisplayItemRenderer() {
		super(new PizzeriaSignFfps2DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFfps2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
