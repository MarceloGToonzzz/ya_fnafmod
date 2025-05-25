package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo02PileDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo02PileDisplayItem;

public class Endo02PileDisplayItemRenderer extends GeoItemRenderer<Endo02PileDisplayItem> {
	public Endo02PileDisplayItemRenderer() {
		super(new Endo02PileDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02PileDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
