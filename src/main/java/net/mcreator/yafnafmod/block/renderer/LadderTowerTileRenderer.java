package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LadderTowerBlockModel;
import net.mcreator.yafnafmod.block.entity.LadderTowerTileEntity;

public class LadderTowerTileRenderer extends GeoBlockRenderer<LadderTowerTileEntity> {
	public LadderTowerTileRenderer() {
		super(new LadderTowerBlockModel());
	}

	@Override
	public RenderType getRenderType(LadderTowerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
