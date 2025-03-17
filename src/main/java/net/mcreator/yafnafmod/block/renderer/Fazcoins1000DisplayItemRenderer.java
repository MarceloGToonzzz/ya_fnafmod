package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins1000DisplayModel;
import net.mcreator.yafnafmod.block.display.Fazcoins1000DisplayItem;

public class Fazcoins1000DisplayItemRenderer extends GeoItemRenderer<Fazcoins1000DisplayItem> {
	public Fazcoins1000DisplayItemRenderer() {
		super(new Fazcoins1000DisplayModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins1000DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
