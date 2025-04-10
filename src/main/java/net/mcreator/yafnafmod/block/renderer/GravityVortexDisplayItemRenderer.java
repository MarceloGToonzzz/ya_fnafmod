package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GravityVortexDisplayModel;
import net.mcreator.yafnafmod.block.display.GravityVortexDisplayItem;

public class GravityVortexDisplayItemRenderer extends GeoItemRenderer<GravityVortexDisplayItem> {
	public GravityVortexDisplayItemRenderer() {
		super(new GravityVortexDisplayModel());
	}

	@Override
	public RenderType getRenderType(GravityVortexDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
