package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarPoliceCruiserChevroletImpala1983BlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarPoliceCruiserChevroletImpala1983BlockDisplayItem;

public class CarPoliceCruiserChevroletImpala1983BlockDisplayItemRenderer extends GeoItemRenderer<CarPoliceCruiserChevroletImpala1983BlockDisplayItem> {
	public CarPoliceCruiserChevroletImpala1983BlockDisplayItemRenderer() {
		super(new CarPoliceCruiserChevroletImpala1983BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarPoliceCruiserChevroletImpala1983BlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
