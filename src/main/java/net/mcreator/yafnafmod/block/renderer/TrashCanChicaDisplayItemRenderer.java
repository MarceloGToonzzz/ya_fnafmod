package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanChicaDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashCanChicaDisplayItem;

public class TrashCanChicaDisplayItemRenderer extends GeoItemRenderer<TrashCanChicaDisplayItem> {
	public TrashCanChicaDisplayItemRenderer() {
		super(new TrashCanChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashCanChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
