package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1988BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1988TileEntity;

public class PizzaBoxStack1988TileRenderer extends GeoBlockRenderer<PizzaBoxStack1988TileEntity> {
	public PizzaBoxStack1988TileRenderer() {
		super(new PizzaBoxStack1988BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1988TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
