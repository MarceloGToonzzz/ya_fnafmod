package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins10000BlockModel;
import net.mcreator.yafnafmod.block.entity.Fazcoins10000TileEntity;

public class Fazcoins10000TileRenderer extends GeoBlockRenderer<Fazcoins10000TileEntity> {
	public Fazcoins10000TileRenderer() {
		super(new Fazcoins10000BlockModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins10000TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
