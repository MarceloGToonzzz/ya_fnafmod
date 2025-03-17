package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Bobbleheads1DisplayModel;
import net.mcreator.yafnafmod.block.display.Bobbleheads1DisplayItem;

public class Bobbleheads1DisplayItemRenderer extends GeoItemRenderer<Bobbleheads1DisplayItem> {
	public Bobbleheads1DisplayItemRenderer() {
		super(new Bobbleheads1DisplayModel());
	}

	@Override
	public RenderType getRenderType(Bobbleheads1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
