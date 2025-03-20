package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaFoxyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DittophobiaFoxyBlockDisplayItem;

public class DittophobiaFoxyBlockDisplayItemRenderer extends GeoItemRenderer<DittophobiaFoxyBlockDisplayItem> {
	public DittophobiaFoxyBlockDisplayItemRenderer() {
		super(new DittophobiaFoxyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaFoxyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
