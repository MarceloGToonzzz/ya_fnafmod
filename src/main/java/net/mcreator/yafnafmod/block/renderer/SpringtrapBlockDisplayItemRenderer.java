package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringtrapBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.SpringtrapBlockDisplayItem;

public class SpringtrapBlockDisplayItemRenderer extends GeoItemRenderer<SpringtrapBlockDisplayItem> {
	public SpringtrapBlockDisplayItemRenderer() {
		super(new SpringtrapBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringtrapBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
