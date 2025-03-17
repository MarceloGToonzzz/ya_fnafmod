package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeactivatedBalloraDisplayModel;
import net.mcreator.yafnafmod.block.display.DeactivatedBalloraDisplayItem;

public class DeactivatedBalloraDisplayItemRenderer extends GeoItemRenderer<DeactivatedBalloraDisplayItem> {
	public DeactivatedBalloraDisplayItemRenderer() {
		super(new DeactivatedBalloraDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeactivatedBalloraDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
