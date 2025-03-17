package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SkeeballPizzarollerBlockModel;
import net.mcreator.yafnafmod.block.entity.SkeeballPizzarollerTileEntity;

public class SkeeballPizzarollerTileRenderer extends GeoBlockRenderer<SkeeballPizzarollerTileEntity> {
	public SkeeballPizzarollerTileRenderer() {
		super(new SkeeballPizzarollerBlockModel());
	}

	@Override
	public RenderType getRenderType(SkeeballPizzarollerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
