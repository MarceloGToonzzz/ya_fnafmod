package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanCupcakeDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashCanCupcakeDisplayItem;

public class TrashCanCupcakeDisplayItemRenderer extends GeoItemRenderer<TrashCanCupcakeDisplayItem> {
	public TrashCanCupcakeDisplayItemRenderer() {
		super(new TrashCanCupcakeDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashCanCupcakeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
