package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarFazvanBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarFazvanBlockTileEntity;

public class CarFazvanBlockTileRenderer extends GeoBlockRenderer<CarFazvanBlockTileEntity> {
	public CarFazvanBlockTileRenderer() {
		super(new CarFazvanBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarFazvanBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
