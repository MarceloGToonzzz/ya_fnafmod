package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeDelilahBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FuntimeDelilahBlockDisplayItem;

public class FuntimeDelilahBlockDisplayItemRenderer extends GeoItemRenderer<FuntimeDelilahBlockDisplayItem> {
	public FuntimeDelilahBlockDisplayItemRenderer() {
		super(new FuntimeDelilahBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FuntimeDelilahBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
