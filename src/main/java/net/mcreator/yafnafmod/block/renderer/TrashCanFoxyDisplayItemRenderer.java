package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanFoxyDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashCanFoxyDisplayItem;

public class TrashCanFoxyDisplayItemRenderer extends GeoItemRenderer<TrashCanFoxyDisplayItem> {
	public TrashCanFoxyDisplayItemRenderer() {
		super(new TrashCanFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashCanFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
