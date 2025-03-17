package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FazOvenDisplayModel;
import net.mcreator.yafnafmod.block.display.FazOvenDisplayItem;

public class FazOvenDisplayItemRenderer extends GeoItemRenderer<FazOvenDisplayItem> {
	public FazOvenDisplayItemRenderer() {
		super(new FazOvenDisplayModel());
	}

	@Override
	public RenderType getRenderType(FazOvenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
