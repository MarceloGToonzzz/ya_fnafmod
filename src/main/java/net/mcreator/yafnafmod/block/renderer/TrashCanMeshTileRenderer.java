package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanMeshBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashCanMeshTileEntity;

public class TrashCanMeshTileRenderer extends GeoBlockRenderer<TrashCanMeshTileEntity> {
	public TrashCanMeshTileRenderer() {
		super(new TrashCanMeshBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanMeshTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
