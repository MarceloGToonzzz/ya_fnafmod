package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins100DisplayModel;
import net.mcreator.yafnafmod.block.display.Fazcoins100DisplayItem;

public class Fazcoins100DisplayItemRenderer extends GeoItemRenderer<Fazcoins100DisplayItem> {
	public Fazcoins100DisplayItemRenderer() {
		super(new Fazcoins100DisplayModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins100DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
