package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins10000DisplayModel;
import net.mcreator.yafnafmod.block.display.Fazcoins10000DisplayItem;

public class Fazcoins10000DisplayItemRenderer extends GeoItemRenderer<Fazcoins10000DisplayItem> {
	public Fazcoins10000DisplayItemRenderer() {
		super(new Fazcoins10000DisplayModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins10000DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
