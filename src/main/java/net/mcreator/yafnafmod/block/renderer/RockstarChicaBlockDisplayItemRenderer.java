package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarChicaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RockstarChicaBlockDisplayItem;

public class RockstarChicaBlockDisplayItemRenderer extends GeoItemRenderer<RockstarChicaBlockDisplayItem> {
	public RockstarChicaBlockDisplayItemRenderer() {
		super(new RockstarChicaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockstarChicaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
