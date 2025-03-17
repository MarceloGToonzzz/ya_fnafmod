package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFredbearBlockModel;
import net.mcreator.yafnafmod.block.entity.CarouselFredbearTileEntity;

public class CarouselFredbearTileRenderer extends GeoBlockRenderer<CarouselFredbearTileEntity> {
	public CarouselFredbearTileRenderer() {
		super(new CarouselFredbearBlockModel());
	}

	@Override
	public RenderType getRenderType(CarouselFredbearTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
