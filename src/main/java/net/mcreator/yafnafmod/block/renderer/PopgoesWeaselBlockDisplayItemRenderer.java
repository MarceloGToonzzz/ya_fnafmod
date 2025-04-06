package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PopgoesWeaselBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.PopgoesWeaselBlockDisplayItem;

public class PopgoesWeaselBlockDisplayItemRenderer extends GeoItemRenderer<PopgoesWeaselBlockDisplayItem> {
	public PopgoesWeaselBlockDisplayItemRenderer() {
		super(new PopgoesWeaselBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(PopgoesWeaselBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
