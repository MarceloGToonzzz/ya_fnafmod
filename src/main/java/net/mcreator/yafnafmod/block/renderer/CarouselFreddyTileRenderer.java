package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.CarouselFreddyTileEntity;

public class CarouselFreddyTileRenderer extends GeoBlockRenderer<CarouselFreddyTileEntity> {
	public CarouselFreddyTileRenderer() {
		super(new CarouselFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(CarouselFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
