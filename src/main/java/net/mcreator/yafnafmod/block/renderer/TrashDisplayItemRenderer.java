package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashDisplayItem;

public class TrashDisplayItemRenderer extends GeoItemRenderer<TrashDisplayItem> {
	public TrashDisplayItemRenderer() {
		super(new TrashDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
