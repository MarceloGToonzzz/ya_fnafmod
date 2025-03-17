package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarDodgeRam1982BlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarDodgeRam1982BlockDisplayItem;

public class CarDodgeRam1982BlockDisplayItemRenderer extends GeoItemRenderer<CarDodgeRam1982BlockDisplayItem> {
	public CarDodgeRam1982BlockDisplayItemRenderer() {
		super(new CarDodgeRam1982BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarDodgeRam1982BlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
