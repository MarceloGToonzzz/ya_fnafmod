package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonnieBunnyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BonnieBunnyBlockDisplayItem;

public class BonnieBunnyBlockDisplayItemRenderer extends GeoItemRenderer<BonnieBunnyBlockDisplayItem> {
	public BonnieBunnyBlockDisplayItemRenderer() {
		super(new BonnieBunnyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnieBunnyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
