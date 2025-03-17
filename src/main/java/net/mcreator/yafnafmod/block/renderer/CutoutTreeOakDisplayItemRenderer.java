package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutTreeOakDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutTreeOakDisplayItem;

public class CutoutTreeOakDisplayItemRenderer extends GeoItemRenderer<CutoutTreeOakDisplayItem> {
	public CutoutTreeOakDisplayItemRenderer() {
		super(new CutoutTreeOakDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutTreeOakDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
