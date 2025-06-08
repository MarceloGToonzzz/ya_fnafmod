package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Bobbleheads3DisplayModel;
import net.mcreator.yafnafmod.block.display.Bobbleheads3DisplayItem;

public class Bobbleheads3DisplayItemRenderer extends GeoItemRenderer<Bobbleheads3DisplayItem> {
	public Bobbleheads3DisplayItemRenderer() {
		super(new Bobbleheads3DisplayModel());
	}

	@Override
	public RenderType getRenderType(Bobbleheads3DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
