package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CircusBabyClockBlockModel;
import net.mcreator.yafnafmod.block.entity.CircusBabyClockTileEntity;

public class CircusBabyClockTileRenderer extends GeoBlockRenderer<CircusBabyClockTileEntity> {
	public CircusBabyClockTileRenderer() {
		super(new CircusBabyClockBlockModel());
	}

	@Override
	public RenderType getRenderType(CircusBabyClockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
