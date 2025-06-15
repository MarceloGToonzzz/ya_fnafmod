package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SecurityGateDisplayModel;
import net.mcreator.yafnafmod.block.display.SecurityGateDisplayItem;

public class SecurityGateDisplayItemRenderer extends GeoItemRenderer<SecurityGateDisplayItem> {
	public SecurityGateDisplayItemRenderer() {
		super(new SecurityGateDisplayModel());
	}

	@Override
	public RenderType getRenderType(SecurityGateDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
