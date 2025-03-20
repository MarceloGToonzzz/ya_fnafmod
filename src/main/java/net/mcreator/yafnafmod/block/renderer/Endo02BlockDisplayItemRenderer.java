package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo02BlockDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo02BlockDisplayItem;

public class Endo02BlockDisplayItemRenderer extends GeoItemRenderer<Endo02BlockDisplayItem> {
	public Endo02BlockDisplayItemRenderer() {
		super(new Endo02BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02BlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
