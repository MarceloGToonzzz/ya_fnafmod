package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyBonnieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ToyBonnieBlockDisplayItem;

public class ToyBonnieBlockDisplayItemRenderer extends GeoItemRenderer<ToyBonnieBlockDisplayItem> {
	public ToyBonnieBlockDisplayItemRenderer() {
		super(new ToyBonnieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ToyBonnieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
