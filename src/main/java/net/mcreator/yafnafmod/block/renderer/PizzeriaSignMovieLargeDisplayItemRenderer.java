package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignMovieLargeDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignMovieLargeDisplayItem;

public class PizzeriaSignMovieLargeDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignMovieLargeDisplayItem> {
	public PizzeriaSignMovieLargeDisplayItemRenderer() {
		super(new PizzeriaSignMovieLargeDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignMovieLargeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
