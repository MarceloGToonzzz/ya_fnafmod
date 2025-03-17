package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClownFruitPunchDisplayModel;
import net.mcreator.yafnafmod.block.display.ClownFruitPunchDisplayItem;

public class ClownFruitPunchDisplayItemRenderer extends GeoItemRenderer<ClownFruitPunchDisplayItem> {
	public ClownFruitPunchDisplayItemRenderer() {
		super(new ClownFruitPunchDisplayModel());
	}

	@Override
	public RenderType getRenderType(ClownFruitPunchDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
