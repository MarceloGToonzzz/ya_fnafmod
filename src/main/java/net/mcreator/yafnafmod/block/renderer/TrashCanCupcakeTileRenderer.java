package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanCupcakeBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashCanCupcakeTileEntity;

public class TrashCanCupcakeTileRenderer extends GeoBlockRenderer<TrashCanCupcakeTileEntity> {
	public TrashCanCupcakeTileRenderer() {
		super(new TrashCanCupcakeBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanCupcakeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
