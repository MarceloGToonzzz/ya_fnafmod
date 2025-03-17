package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987TileEntity;

public class PizzaBox1987TileRenderer extends GeoBlockRenderer<PizzaBox1987TileEntity> {
	public PizzaBox1987TileRenderer() {
		super(new PizzaBox1987BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
