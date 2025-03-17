package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox1987AltEmptyBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox1987AltEmptyTileEntity;

public class PizzaBox1987AltEmptyTileRenderer extends GeoBlockRenderer<PizzaBox1987AltEmptyTileEntity> {
	public PizzaBox1987AltEmptyTileRenderer() {
		super(new PizzaBox1987AltEmptyBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox1987AltEmptyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
