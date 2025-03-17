package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyChicaChickenBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyChicaChickenBlockDisplayItem;

public class ToyChicaChickenBlockDisplayItemRenderer extends GeoItemRenderer<ToyChicaChickenBlockDisplayItem> {
	public ToyChicaChickenBlockDisplayItemRenderer() {
		super(new ToyChicaChickenBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyChicaChickenBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
