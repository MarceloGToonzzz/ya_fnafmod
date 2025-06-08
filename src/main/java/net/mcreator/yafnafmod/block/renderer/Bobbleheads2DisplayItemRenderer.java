package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Bobbleheads2DisplayModel;
import net.mcreator.yafnafmod.block.display.Bobbleheads2DisplayItem;

public class Bobbleheads2DisplayItemRenderer extends GeoItemRenderer<Bobbleheads2DisplayItem> {
	public Bobbleheads2DisplayItemRenderer() {
		super(new Bobbleheads2DisplayModel());
	}

	@Override
	public RenderType getRenderType(Bobbleheads2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
