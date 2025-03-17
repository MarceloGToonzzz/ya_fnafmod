package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarHarleyMotorcycleBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarHarleyMotorcycleBlockTileEntity;

public class CarHarleyMotorcycleBlockTileRenderer extends GeoBlockRenderer<CarHarleyMotorcycleBlockTileEntity> {
	public CarHarleyMotorcycleBlockTileRenderer() {
		super(new CarHarleyMotorcycleBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarHarleyMotorcycleBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
