package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NumberOneCrateBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.NumberOneCrateBlockDisplayItem;

public class NumberOneCrateBlockDisplayItemRenderer extends GeoItemRenderer<NumberOneCrateBlockDisplayItem> {
	public NumberOneCrateBlockDisplayItemRenderer() {
		super(new NumberOneCrateBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(NumberOneCrateBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
