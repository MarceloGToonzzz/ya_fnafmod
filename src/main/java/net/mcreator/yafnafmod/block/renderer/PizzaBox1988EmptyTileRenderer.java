package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1988EmptyBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1988EmptyTileEntity;

public class PizzaBox1988EmptyTileRenderer extends GeoBlockRenderer<PizzaBox1988EmptyTileEntity> {
	public PizzaBox1988EmptyTileRenderer() {
		super(new PizzaBox1988EmptyBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1988EmptyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
