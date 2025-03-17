package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RidingRocketRedDisplayModel;
import net.mcreator.yafnafmod.block.display.RidingRocketRedDisplayItem;

public class RidingRocketRedDisplayItemRenderer extends GeoItemRenderer<RidingRocketRedDisplayItem> {
	public RidingRocketRedDisplayItemRenderer() {
		super(new RidingRocketRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketRedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
