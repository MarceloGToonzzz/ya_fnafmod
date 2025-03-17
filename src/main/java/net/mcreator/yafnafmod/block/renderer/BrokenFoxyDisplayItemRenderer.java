package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BrokenFoxyDisplayModel;
import net.mcreator.yafnafmod.block.display.BrokenFoxyDisplayItem;

public class BrokenFoxyDisplayItemRenderer extends GeoItemRenderer<BrokenFoxyDisplayItem> {
	public BrokenFoxyDisplayItemRenderer() {
		super(new BrokenFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrokenFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
