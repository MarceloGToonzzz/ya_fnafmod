package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarStationWagonBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarStationWagonBlockTileEntity;

public class CarStationWagonBlockTileRenderer extends GeoBlockRenderer<CarStationWagonBlockTileEntity> {
	public CarStationWagonBlockTileRenderer() {
		super(new CarStationWagonBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarStationWagonBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
