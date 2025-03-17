package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringbonnieBlock01DisplayModel;
import net.mcreator.yafnafmod.block.display.SpringbonnieBlock01DisplayItem;

public class SpringbonnieBlock01DisplayItemRenderer extends GeoItemRenderer<SpringbonnieBlock01DisplayItem> {
	public SpringbonnieBlock01DisplayItemRenderer() {
		super(new SpringbonnieBlock01DisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieBlock01DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
