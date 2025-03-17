package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SecurityPuppetPropDisplayModel;
import net.mcreator.yafnafmod.block.display.SecurityPuppetPropDisplayItem;

public class SecurityPuppetPropDisplayItemRenderer extends GeoItemRenderer<SecurityPuppetPropDisplayItem> {
	public SecurityPuppetPropDisplayItemRenderer() {
		super(new SecurityPuppetPropDisplayModel());
	}

	@Override
	public RenderType getRenderType(SecurityPuppetPropDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
