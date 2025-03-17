package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzaBoxStack1985BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzaBoxStack1985TileEntity;

public class PizzaBoxStack1985TileRenderer extends GeoBlockRenderer<PizzaBoxStack1985TileEntity> {
	public PizzaBoxStack1985TileRenderer() {
		super(new PizzaBoxStack1985BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzaBoxStack1985TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
