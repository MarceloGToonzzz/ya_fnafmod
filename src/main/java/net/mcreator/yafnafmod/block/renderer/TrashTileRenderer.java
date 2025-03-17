package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashTileEntity;

public class TrashTileRenderer extends GeoBlockRenderer<TrashTileEntity> {
	public TrashTileRenderer() {
		super(new TrashBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
