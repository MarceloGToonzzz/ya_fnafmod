package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanBonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashCanBonnieTileEntity;

public class TrashCanBonnieTileRenderer extends GeoBlockRenderer<TrashCanBonnieTileEntity> {
	public TrashCanBonnieTileRenderer() {
		super(new TrashCanBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
