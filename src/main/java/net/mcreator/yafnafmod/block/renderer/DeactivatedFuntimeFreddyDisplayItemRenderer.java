package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeactivatedFuntimeFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.DeactivatedFuntimeFreddyDisplayItem;

public class DeactivatedFuntimeFreddyDisplayItemRenderer extends GeoItemRenderer<DeactivatedFuntimeFreddyDisplayItem> {
	public DeactivatedFuntimeFreddyDisplayItemRenderer() {
		super(new DeactivatedFuntimeFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeactivatedFuntimeFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
