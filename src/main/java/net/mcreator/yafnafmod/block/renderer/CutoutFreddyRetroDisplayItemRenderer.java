package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFreddyRetroDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFreddyRetroDisplayItem;

public class CutoutFreddyRetroDisplayItemRenderer extends GeoItemRenderer<CutoutFreddyRetroDisplayItem> {
	public CutoutFreddyRetroDisplayItemRenderer() {
		super(new CutoutFreddyRetroDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFreddyRetroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
