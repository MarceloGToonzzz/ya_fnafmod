package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RosieDisplayModel;
import net.mcreator.yafnafmod.block.display.RosieDisplayItem;

public class RosieDisplayItemRenderer extends GeoItemRenderer<RosieDisplayItem> {
	public RosieDisplayItemRenderer() {
		super(new RosieDisplayModel());
	}

	@Override
	public RenderType getRenderType(RosieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
