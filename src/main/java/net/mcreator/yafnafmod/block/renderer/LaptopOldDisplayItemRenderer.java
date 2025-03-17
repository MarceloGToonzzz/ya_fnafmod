package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LaptopOldDisplayModel;
import net.mcreator.yafnafmod.block.display.LaptopOldDisplayItem;

public class LaptopOldDisplayItemRenderer extends GeoItemRenderer<LaptopOldDisplayItem> {
	public LaptopOldDisplayItemRenderer() {
		super(new LaptopOldDisplayModel());
	}

	@Override
	public RenderType getRenderType(LaptopOldDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
