package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01BlockDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo01BlockDisplayItem;

public class Endo01BlockDisplayItemRenderer extends GeoItemRenderer<Endo01BlockDisplayItem> {
	public Endo01BlockDisplayItemRenderer() {
		super(new Endo01BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01BlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
