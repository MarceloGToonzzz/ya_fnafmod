package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BlastSecurityDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BlastSecurityDoorTileEntity;

public class BlastSecurityDoorTileRenderer extends GeoBlockRenderer<BlastSecurityDoorTileEntity> {
	public BlastSecurityDoorTileRenderer() {
		super(new BlastSecurityDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BlastSecurityDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
