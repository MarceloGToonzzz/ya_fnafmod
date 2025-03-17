package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1979EmptyBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1979EmptyTileEntity;

public class PizzaBox1979EmptyTileRenderer extends GeoBlockRenderer<PizzaBox1979EmptyTileEntity> {
	public PizzaBox1979EmptyTileRenderer() {
		super(new PizzaBox1979EmptyBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1979EmptyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
