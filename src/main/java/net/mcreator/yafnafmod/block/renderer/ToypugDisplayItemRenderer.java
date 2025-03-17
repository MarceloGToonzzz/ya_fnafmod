package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToypugDisplayModel;
import net.mcreator.yafnafmod.block.display.ToypugDisplayItem;

public class ToypugDisplayItemRenderer extends GeoItemRenderer<ToypugDisplayItem> {
	public ToypugDisplayItemRenderer() {
		super(new ToypugDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToypugDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
