package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01PileDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo01PileDisplayItem;

public class Endo01PileDisplayItemRenderer extends GeoItemRenderer<Endo01PileDisplayItem> {
	public Endo01PileDisplayItemRenderer() {
		super(new Endo01PileDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01PileDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
