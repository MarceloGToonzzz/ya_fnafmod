package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanChicaBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashCanChicaTileEntity;

public class TrashCanChicaTileRenderer extends GeoBlockRenderer<TrashCanChicaTileEntity> {
	public TrashCanChicaTileRenderer() {
		super(new TrashCanChicaBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanChicaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
