package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignMovieDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignMovieDisplayItem;

public class PizzeriaSignMovieDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignMovieDisplayItem> {
	public PizzeriaSignMovieDisplayItemRenderer() {
		super(new PizzeriaSignMovieDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignMovieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
