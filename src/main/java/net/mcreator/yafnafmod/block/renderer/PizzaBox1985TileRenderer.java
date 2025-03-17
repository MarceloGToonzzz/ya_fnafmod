package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1985BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1985TileEntity;

public class PizzaBox1985TileRenderer extends GeoBlockRenderer<PizzaBox1985TileEntity> {
	public PizzaBox1985TileRenderer() {
		super(new PizzaBox1985BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1985TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
