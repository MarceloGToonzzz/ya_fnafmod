package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarPurpleChevroletImpalaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarPurpleChevroletImpalaBlockTileEntity;

public class CarPurpleChevroletImpalaBlockTileRenderer extends GeoBlockRenderer<CarPurpleChevroletImpalaBlockTileEntity> {
	public CarPurpleChevroletImpalaBlockTileRenderer() {
		super(new CarPurpleChevroletImpalaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarPurpleChevroletImpalaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
