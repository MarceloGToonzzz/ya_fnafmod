package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NoveltyTrafficLightDisplayModel;
import net.mcreator.yafnafmod.block.display.NoveltyTrafficLightDisplayItem;

public class NoveltyTrafficLightDisplayItemRenderer extends GeoItemRenderer<NoveltyTrafficLightDisplayItem> {
	public NoveltyTrafficLightDisplayItemRenderer() {
		super(new NoveltyTrafficLightDisplayModel());
	}

	@Override
	public RenderType getRenderType(NoveltyTrafficLightDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
