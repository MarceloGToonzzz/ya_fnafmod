package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BoxPlatesDisplayModel;
import net.mcreator.yafnafmod.block.display.BoxPlatesDisplayItem;

public class BoxPlatesDisplayItemRenderer extends GeoItemRenderer<BoxPlatesDisplayItem> {
	public BoxPlatesDisplayItemRenderer() {
		super(new BoxPlatesDisplayModel());
	}

	@Override
	public RenderType getRenderType(BoxPlatesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
