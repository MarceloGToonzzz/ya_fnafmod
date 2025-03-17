package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringbonnieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.SpringbonnieBlockDisplayItem;

public class SpringbonnieBlockDisplayItemRenderer extends GeoItemRenderer<SpringbonnieBlockDisplayItem> {
	public SpringbonnieBlockDisplayItemRenderer() {
		super(new SpringbonnieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
