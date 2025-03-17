package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonnieStandDisplayModel;
import net.mcreator.yafnafmod.block.display.BonnieStandDisplayItem;

public class BonnieStandDisplayItemRenderer extends GeoItemRenderer<BonnieStandDisplayItem> {
	public BonnieStandDisplayItemRenderer() {
		super(new BonnieStandDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonnieStandDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
