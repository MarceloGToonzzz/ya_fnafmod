package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins1000BlockModel;
import net.mcreator.yafnafmod.block.entity.Fazcoins1000TileEntity;

public class Fazcoins1000TileRenderer extends GeoBlockRenderer<Fazcoins1000TileEntity> {
	public Fazcoins1000TileRenderer() {
		super(new Fazcoins1000BlockModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins1000TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
