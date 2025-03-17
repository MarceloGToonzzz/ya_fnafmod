package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarouselFreddyToyBlockModel;
import net.mcreator.yafnafmod.block.entity.CarouselFreddyToyTileEntity;

public class CarouselFreddyToyTileRenderer extends GeoBlockRenderer<CarouselFreddyToyTileEntity> {
	public CarouselFreddyToyTileRenderer() {
		super(new CarouselFreddyToyBlockModel());
	}

	@Override
	public RenderType getRenderType(CarouselFreddyToyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
