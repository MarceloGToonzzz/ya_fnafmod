package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarFazvanPropBlockModel;
import net.mcreator.yafnafmod.block.entity.CarFazvanPropTileEntity;

public class CarFazvanPropTileRenderer extends GeoBlockRenderer<CarFazvanPropTileEntity> {
	public CarFazvanPropTileRenderer() {
		super(new CarFazvanPropBlockModel());
	}

	@Override
	public RenderType getRenderType(CarFazvanPropTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
