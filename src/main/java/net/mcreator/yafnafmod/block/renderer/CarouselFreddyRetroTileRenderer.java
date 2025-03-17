package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFreddyRetroBlockModel;
import net.mcreator.yafnafmod.block.entity.CarouselFreddyRetroTileEntity;

public class CarouselFreddyRetroTileRenderer extends GeoBlockRenderer<CarouselFreddyRetroTileEntity> {
	public CarouselFreddyRetroTileRenderer() {
		super(new CarouselFreddyRetroBlockModel());
	}

	@Override
	public RenderType getRenderType(CarouselFreddyRetroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
