package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBox2023BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBox2023TileEntity;

public class PizzaBox2023TileRenderer extends GeoBlockRenderer<PizzaBox2023TileEntity> {
	public PizzaBox2023TileRenderer() {
		super(new PizzaBox2023BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBox2023TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
