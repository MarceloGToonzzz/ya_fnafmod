package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarDesotoBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarDesotoBlockTileEntity;

public class CarDesotoBlockTileRenderer extends GeoBlockRenderer<CarDesotoBlockTileEntity> {
	public CarDesotoBlockTileRenderer() {
		super(new CarDesotoBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarDesotoBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
