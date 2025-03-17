package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarFoxyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RockstarFoxyBlockDisplayItem;

public class RockstarFoxyBlockDisplayItemRenderer extends GeoItemRenderer<RockstarFoxyBlockDisplayItem> {
	public RockstarFoxyBlockDisplayItemRenderer() {
		super(new RockstarFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockstarFoxyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
