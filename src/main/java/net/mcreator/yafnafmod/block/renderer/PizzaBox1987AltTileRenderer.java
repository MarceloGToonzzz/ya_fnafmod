package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987AltBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987AltTileEntity;

public class PizzaBox1987AltTileRenderer extends GeoBlockRenderer<PizzaBox1987AltTileEntity> {
	public PizzaBox1987AltTileRenderer() {
		super(new PizzaBox1987AltBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987AltTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
