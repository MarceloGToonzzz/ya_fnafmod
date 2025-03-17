package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutBonnieRetroDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutBonnieRetroDisplayItem;

public class CutoutBonnieRetroDisplayItemRenderer extends GeoItemRenderer<CutoutBonnieRetroDisplayItem> {
	public CutoutBonnieRetroDisplayItemRenderer() {
		super(new CutoutBonnieRetroDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBonnieRetroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
