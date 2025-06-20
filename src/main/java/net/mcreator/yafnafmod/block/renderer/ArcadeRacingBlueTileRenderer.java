package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeRacingBlueBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeRacingBlueTileEntity;

public class ArcadeRacingBlueTileRenderer extends GeoBlockRenderer<ArcadeRacingBlueTileEntity> {
	public ArcadeRacingBlueTileRenderer() {
		super(new ArcadeRacingBlueBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeRacingBlueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
