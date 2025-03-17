package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1979BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1979TileEntity;

public class PizzaBoxStack1979TileRenderer extends GeoBlockRenderer<PizzaBoxStack1979TileEntity> {
	public PizzaBoxStack1979TileRenderer() {
		super(new PizzaBoxStack1979BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1979TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
