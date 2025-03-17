package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins5BlockModel;
import net.mcreator.yafnafmod.block.entity.Fazcoins5TileEntity;

public class Fazcoins5TileRenderer extends GeoBlockRenderer<Fazcoins5TileEntity> {
	public Fazcoins5TileRenderer() {
		super(new Fazcoins5BlockModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins5TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
