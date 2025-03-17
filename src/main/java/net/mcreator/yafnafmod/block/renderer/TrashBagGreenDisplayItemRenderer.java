package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashBagGreenDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashBagGreenDisplayItem;

public class TrashBagGreenDisplayItemRenderer extends GeoItemRenderer<TrashBagGreenDisplayItem> {
	public TrashBagGreenDisplayItemRenderer() {
		super(new TrashBagGreenDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashBagGreenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
