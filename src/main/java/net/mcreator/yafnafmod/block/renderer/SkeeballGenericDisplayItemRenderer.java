package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SkeeballGenericDisplayModel;
import net.mcreator.yafnafmod.block.display.SkeeballGenericDisplayItem;

public class SkeeballGenericDisplayItemRenderer extends GeoItemRenderer<SkeeballGenericDisplayItem> {
	public SkeeballGenericDisplayItemRenderer() {
		super(new SkeeballGenericDisplayModel());
	}

	@Override
	public RenderType getRenderType(SkeeballGenericDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
