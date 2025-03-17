package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanFoxyBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashCanFoxyTileEntity;

public class TrashCanFoxyTileRenderer extends GeoBlockRenderer<TrashCanFoxyTileEntity> {
	public TrashCanFoxyTileRenderer() {
		super(new TrashCanFoxyBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanFoxyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
