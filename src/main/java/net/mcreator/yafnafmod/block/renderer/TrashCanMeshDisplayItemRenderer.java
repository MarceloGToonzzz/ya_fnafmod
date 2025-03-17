package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanMeshDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashCanMeshDisplayItem;

public class TrashCanMeshDisplayItemRenderer extends GeoItemRenderer<TrashCanMeshDisplayItem> {
	public TrashCanMeshDisplayItemRenderer() {
		super(new TrashCanMeshDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashCanMeshDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
