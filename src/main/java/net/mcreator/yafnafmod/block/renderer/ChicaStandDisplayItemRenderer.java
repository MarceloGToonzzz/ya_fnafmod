package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ChicaStandDisplayModel;
import net.mcreator.yafnafmod.block.display.ChicaStandDisplayItem;

public class ChicaStandDisplayItemRenderer extends GeoItemRenderer<ChicaStandDisplayItem> {
	public ChicaStandDisplayItemRenderer() {
		super(new ChicaStandDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChicaStandDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
