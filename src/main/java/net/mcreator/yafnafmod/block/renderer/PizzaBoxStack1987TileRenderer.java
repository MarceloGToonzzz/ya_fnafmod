package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1987BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1987TileEntity;

public class PizzaBoxStack1987TileRenderer extends GeoBlockRenderer<PizzaBoxStack1987TileEntity> {
	public PizzaBoxStack1987TileRenderer() {
		super(new PizzaBoxStack1987BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1987TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
