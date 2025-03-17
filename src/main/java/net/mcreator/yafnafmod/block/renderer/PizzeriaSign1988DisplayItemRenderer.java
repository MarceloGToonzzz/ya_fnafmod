package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSign1988DisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSign1988DisplayItem;

public class PizzeriaSign1988DisplayItemRenderer extends GeoItemRenderer<PizzeriaSign1988DisplayItem> {
	public PizzeriaSign1988DisplayItemRenderer() {
		super(new PizzeriaSign1988DisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSign1988DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
