package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fredbear01BlockDisplayModel;
import net.mcreator.yafnafmod.block.display.Fredbear01BlockDisplayItem;

public class Fredbear01BlockDisplayItemRenderer extends GeoItemRenderer<Fredbear01BlockDisplayItem> {
	public Fredbear01BlockDisplayItemRenderer() {
		super(new Fredbear01BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(Fredbear01BlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
