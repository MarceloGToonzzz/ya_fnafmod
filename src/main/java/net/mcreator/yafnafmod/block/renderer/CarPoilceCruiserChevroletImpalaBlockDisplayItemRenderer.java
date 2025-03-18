package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarPoilceCruiserChevroletImpalaBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.CarPoilceCruiserChevroletImpalaBlockDisplayItem;

public class CarPoilceCruiserChevroletImpalaBlockDisplayItemRenderer extends GeoItemRenderer<CarPoilceCruiserChevroletImpalaBlockDisplayItem> {
	public CarPoilceCruiserChevroletImpalaBlockDisplayItemRenderer() {
		super(new CarPoilceCruiserChevroletImpalaBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarPoilceCruiserChevroletImpalaBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
