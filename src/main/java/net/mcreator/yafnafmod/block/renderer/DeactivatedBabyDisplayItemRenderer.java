package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeactivatedBabyDisplayModel;
import net.mcreator.yafnafmod.block.display.DeactivatedBabyDisplayItem;

public class DeactivatedBabyDisplayItemRenderer extends GeoItemRenderer<DeactivatedBabyDisplayItem> {
	public DeactivatedBabyDisplayItemRenderer() {
		super(new DeactivatedBabyDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeactivatedBabyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
