package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutTreePineDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutTreePineDisplayItem;

public class CutoutTreePineDisplayItemRenderer extends GeoItemRenderer<CutoutTreePineDisplayItem> {
	public CutoutTreePineDisplayItemRenderer() {
		super(new CutoutTreePineDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutTreePineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
