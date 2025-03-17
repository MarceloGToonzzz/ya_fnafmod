package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01PropDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo01PropDisplayItem;

public class Endo01PropDisplayItemRenderer extends GeoItemRenderer<Endo01PropDisplayItem> {
	public Endo01PropDisplayItemRenderer() {
		super(new Endo01PropDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01PropDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
