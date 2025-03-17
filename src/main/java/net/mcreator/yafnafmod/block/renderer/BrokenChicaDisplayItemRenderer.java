package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BrokenChicaDisplayModel;
import net.mcreator.yafnafmod.block.display.BrokenChicaDisplayItem;

public class BrokenChicaDisplayItemRenderer extends GeoItemRenderer<BrokenChicaDisplayItem> {
	public BrokenChicaDisplayItemRenderer() {
		super(new BrokenChicaDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrokenChicaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
