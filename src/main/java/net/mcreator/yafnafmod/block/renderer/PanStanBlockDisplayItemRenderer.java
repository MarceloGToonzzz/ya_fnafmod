package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PanStanBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.PanStanBlockDisplayItem;

public class PanStanBlockDisplayItemRenderer extends GeoItemRenderer<PanStanBlockDisplayItem> {
	public PanStanBlockDisplayItemRenderer() {
		super(new PanStanBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(PanStanBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
