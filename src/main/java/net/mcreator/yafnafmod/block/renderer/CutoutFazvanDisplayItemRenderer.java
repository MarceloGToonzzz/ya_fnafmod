package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFazvanDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFazvanDisplayItem;

public class CutoutFazvanDisplayItemRenderer extends GeoItemRenderer<CutoutFazvanDisplayItem> {
	public CutoutFazvanDisplayItemRenderer() {
		super(new CutoutFazvanDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFazvanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
