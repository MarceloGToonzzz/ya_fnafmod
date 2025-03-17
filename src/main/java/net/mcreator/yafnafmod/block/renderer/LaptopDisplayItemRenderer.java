package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LaptopDisplayModel;
import net.mcreator.yafnafmod.block.display.LaptopDisplayItem;

public class LaptopDisplayItemRenderer extends GeoItemRenderer<LaptopDisplayItem> {
	public LaptopDisplayItemRenderer() {
		super(new LaptopDisplayModel());
	}

	@Override
	public RenderType getRenderType(LaptopDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
