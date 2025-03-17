package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RidingRocketPurpleDisplayModel;
import net.mcreator.yafnafmod.block.display.RidingRocketPurpleDisplayItem;

public class RidingRocketPurpleDisplayItemRenderer extends GeoItemRenderer<RidingRocketPurpleDisplayItem> {
	public RidingRocketPurpleDisplayItemRenderer() {
		super(new RidingRocketPurpleDisplayModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketPurpleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
