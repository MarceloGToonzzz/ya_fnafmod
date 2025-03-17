package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarHarleyMotorcycleBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarHarleyMotorcycleBlockDisplayItem;

public class CarHarleyMotorcycleBlockDisplayItemRenderer extends GeoItemRenderer<CarHarleyMotorcycleBlockDisplayItem> {
	public CarHarleyMotorcycleBlockDisplayItemRenderer() {
		super(new CarHarleyMotorcycleBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarHarleyMotorcycleBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
