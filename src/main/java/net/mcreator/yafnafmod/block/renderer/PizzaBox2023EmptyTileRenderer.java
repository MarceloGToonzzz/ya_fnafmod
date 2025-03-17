package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox2023EmptyBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox2023EmptyTileEntity;

public class PizzaBox2023EmptyTileRenderer extends GeoBlockRenderer<PizzaBox2023EmptyTileEntity> {
	public PizzaBox2023EmptyTileRenderer() {
		super(new PizzaBox2023EmptyBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox2023EmptyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
