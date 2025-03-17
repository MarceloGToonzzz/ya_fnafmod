package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringbonnieHeadDisplayModel;
import net.mcreator.yafnafmod.block.display.SpringbonnieHeadDisplayItem;

public class SpringbonnieHeadDisplayItemRenderer extends GeoItemRenderer<SpringbonnieHeadDisplayItem> {
	public SpringbonnieHeadDisplayItemRenderer() {
		super(new SpringbonnieHeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieHeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
