package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageMoonCreepBlockModel;
import net.mcreator.yafnafmod.block.entity.StageMoonCreepTileEntity;

public class StageMoonCreepTileRenderer extends GeoBlockRenderer<StageMoonCreepTileEntity> {
	public StageMoonCreepTileRenderer() {
		super(new StageMoonCreepBlockModel());
	}

	@Override
	public RenderType getRenderType(StageMoonCreepTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
