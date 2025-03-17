package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Fazcoins25BlockModel;
import net.mcreator.yafnafmod.block.entity.Fazcoins25TileEntity;

public class Fazcoins25TileRenderer extends GeoBlockRenderer<Fazcoins25TileEntity> {
	public Fazcoins25TileRenderer() {
		super(new Fazcoins25BlockModel());
	}

	@Override
	public RenderType getRenderType(Fazcoins25TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
