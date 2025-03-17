package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PotDisplayModel;
import net.mcreator.yafnafmod.block.display.PotDisplayItem;

public class PotDisplayItemRenderer extends GeoItemRenderer<PotDisplayItem> {
	public PotDisplayItemRenderer() {
		super(new PotDisplayModel());
	}

	@Override
	public RenderType getRenderType(PotDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
