package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ChicaChickenBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ChicaChickenBlockDisplayItem;

public class ChicaChickenBlockDisplayItemRenderer extends GeoItemRenderer<ChicaChickenBlockDisplayItem> {
	public ChicaChickenBlockDisplayItemRenderer() {
		super(new ChicaChickenBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChicaChickenBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
