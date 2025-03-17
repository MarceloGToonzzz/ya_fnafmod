package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1979BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1979TileEntity;

public class PizzaBox1979TileRenderer extends GeoBlockRenderer<PizzaBox1979TileEntity> {
	public PizzaBox1979TileRenderer() {
		super(new PizzaBox1979BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1979TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
