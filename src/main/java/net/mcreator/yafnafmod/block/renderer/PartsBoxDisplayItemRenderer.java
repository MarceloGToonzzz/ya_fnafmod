package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PartsBoxDisplayModel;
import net.mcreator.yafnafmod.block.display.PartsBoxDisplayItem;

public class PartsBoxDisplayItemRenderer extends GeoItemRenderer<PartsBoxDisplayItem> {
	public PartsBoxDisplayItemRenderer() {
		super(new PartsBoxDisplayModel());
	}

	@Override
	public RenderType getRenderType(PartsBoxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
