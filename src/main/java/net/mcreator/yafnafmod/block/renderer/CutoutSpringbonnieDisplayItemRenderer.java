package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutSpringbonnieDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutSpringbonnieDisplayItem;

public class CutoutSpringbonnieDisplayItemRenderer extends GeoItemRenderer<CutoutSpringbonnieDisplayItem> {
	public CutoutSpringbonnieDisplayItemRenderer() {
		super(new CutoutSpringbonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutSpringbonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
