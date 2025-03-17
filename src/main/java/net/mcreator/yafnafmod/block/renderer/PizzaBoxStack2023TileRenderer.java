package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack2023BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack2023TileEntity;

public class PizzaBoxStack2023TileRenderer extends GeoBlockRenderer<PizzaBoxStack2023TileEntity> {
	public PizzaBoxStack2023TileRenderer() {
		super(new PizzaBoxStack2023BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack2023TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
