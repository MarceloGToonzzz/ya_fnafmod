package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BrokenBonnieDisplayModel;
import net.mcreator.yafnafmod.block.display.BrokenBonnieDisplayItem;

public class BrokenBonnieDisplayItemRenderer extends GeoItemRenderer<BrokenBonnieDisplayItem> {
	public BrokenBonnieDisplayItemRenderer() {
		super(new BrokenBonnieDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrokenBonnieDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
