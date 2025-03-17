package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1985EmptyBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1985EmptyTileEntity;

public class PizzaBox1985EmptyTileRenderer extends GeoBlockRenderer<PizzaBox1985EmptyTileEntity> {
	public PizzaBox1985EmptyTileRenderer() {
		super(new PizzaBox1985EmptyBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1985EmptyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
