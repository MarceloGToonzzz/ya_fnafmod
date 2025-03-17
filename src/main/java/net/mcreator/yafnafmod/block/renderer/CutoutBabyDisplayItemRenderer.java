package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBabyDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutBabyDisplayItem;

public class CutoutBabyDisplayItemRenderer extends GeoItemRenderer<CutoutBabyDisplayItem> {
	public CutoutBabyDisplayItemRenderer() {
		super(new CutoutBabyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBabyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
