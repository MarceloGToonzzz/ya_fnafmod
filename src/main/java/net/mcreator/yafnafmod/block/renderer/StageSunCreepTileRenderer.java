package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageSunCreepBlockModel;
import net.mcreator.yafnafmod.block.entity.StageSunCreepTileEntity;

public class StageSunCreepTileRenderer extends GeoBlockRenderer<StageSunCreepTileEntity> {
	public StageSunCreepTileRenderer() {
		super(new StageSunCreepBlockModel());
	}

	@Override
	public RenderType getRenderType(StageSunCreepTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
