package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CircusBabyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CircusBabyBlockTileEntity;

public class CircusBabyBlockTileRenderer extends GeoBlockRenderer<CircusBabyBlockTileEntity> {
	public CircusBabyBlockTileRenderer() {
		super(new CircusBabyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CircusBabyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
