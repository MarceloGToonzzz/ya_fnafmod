package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FreddyStandDisplayModel;
import net.mcreator.yafnafmod.block.display.FreddyStandDisplayItem;

public class FreddyStandDisplayItemRenderer extends GeoItemRenderer<FreddyStandDisplayItem> {
	public FreddyStandDisplayItemRenderer() {
		super(new FreddyStandDisplayModel());
	}

	@Override
	public RenderType getRenderType(FreddyStandDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
