package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarPurpleChevroletImpalaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarPurpleChevroletImpalaBlockDisplayItem;

public class CarPurpleChevroletImpalaBlockDisplayItemRenderer extends GeoItemRenderer<CarPurpleChevroletImpalaBlockDisplayItem> {
	public CarPurpleChevroletImpalaBlockDisplayItemRenderer() {
		super(new CarPurpleChevroletImpalaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarPurpleChevroletImpalaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
