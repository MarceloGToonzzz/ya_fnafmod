package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClockWallToyBonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.ClockWallToyBonnieTileEntity;

public class ClockWallToyBonnieTileRenderer extends GeoBlockRenderer<ClockWallToyBonnieTileEntity> {
	public ClockWallToyBonnieTileRenderer() {
		super(new ClockWallToyBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(ClockWallToyBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
