package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageLightYellowBlockModel;
import net.mcreator.yafnafmod.block.entity.StageLightYellowTileEntity;

public class StageLightYellowTileRenderer extends GeoBlockRenderer<StageLightYellowTileEntity> {
	public StageLightYellowTileRenderer() {
		super(new StageLightYellowBlockModel());
	}

	@Override
	public RenderType getRenderType(StageLightYellowTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
