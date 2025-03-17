package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.VanRideDisplayModel;
import net.mcreator.yafnafmod.block.display.VanRideDisplayItem;

public class VanRideDisplayItemRenderer extends GeoItemRenderer<VanRideDisplayItem> {
	public VanRideDisplayItemRenderer() {
		super(new VanRideDisplayModel());
	}

	@Override
	public RenderType getRenderType(VanRideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
