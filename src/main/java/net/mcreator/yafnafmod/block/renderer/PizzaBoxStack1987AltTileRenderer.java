package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1987AltBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1987AltTileEntity;

public class PizzaBoxStack1987AltTileRenderer extends GeoBlockRenderer<PizzaBoxStack1987AltTileEntity> {
	public PizzaBoxStack1987AltTileRenderer() {
		super(new PizzaBoxStack1987AltBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1987AltTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
