package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeRacingPinkBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeRacingPinkTileEntity;

public class ArcadeRacingPinkTileRenderer extends GeoBlockRenderer<ArcadeRacingPinkTileEntity> {
	public ArcadeRacingPinkTileRenderer() {
		super(new ArcadeRacingPinkBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeRacingPinkTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
