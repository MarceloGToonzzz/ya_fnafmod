package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins100BlockModel;
import net.mcreator.yafnafmod.block.entity.Fazcoins100TileEntity;

public class Fazcoins100TileRenderer extends GeoBlockRenderer<Fazcoins100TileEntity> {
	public Fazcoins100TileRenderer() {
		super(new Fazcoins100BlockModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins100TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
