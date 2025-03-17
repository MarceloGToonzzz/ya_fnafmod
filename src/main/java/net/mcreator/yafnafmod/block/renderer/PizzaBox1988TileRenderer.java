package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1988BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1988TileEntity;

public class PizzaBox1988TileRenderer extends GeoBlockRenderer<PizzaBox1988TileEntity> {
	public PizzaBox1988TileRenderer() {
		super(new PizzaBox1988BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1988TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
