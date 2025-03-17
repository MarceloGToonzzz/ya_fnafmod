package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashCanFreddyTileEntity;

public class TrashCanFreddyTileRenderer extends GeoBlockRenderer<TrashCanFreddyTileEntity> {
	public TrashCanFreddyTileRenderer() {
		super(new TrashCanFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashCanFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
