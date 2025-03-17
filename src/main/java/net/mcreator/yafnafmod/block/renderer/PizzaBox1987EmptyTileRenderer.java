package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987EmptyBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987EmptyTileEntity;

public class PizzaBox1987EmptyTileRenderer extends GeoBlockRenderer<PizzaBox1987EmptyTileEntity> {
	public PizzaBox1987EmptyTileRenderer() {
		super(new PizzaBox1987EmptyBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987EmptyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
