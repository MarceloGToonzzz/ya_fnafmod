package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredBonnieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredBonnieBlockDisplayItem;

public class WitheredBonnieBlockDisplayItemRenderer extends GeoItemRenderer<WitheredBonnieBlockDisplayItem> {
	public WitheredBonnieBlockDisplayItemRenderer() {
		super(new WitheredBonnieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredBonnieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
