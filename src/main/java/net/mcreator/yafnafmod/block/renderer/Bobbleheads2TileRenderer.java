package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Bobbleheads2BlockModel;
import net.mcreator.yafnafmod.block.entity.Bobbleheads2TileEntity;

public class Bobbleheads2TileRenderer extends GeoBlockRenderer<Bobbleheads2TileEntity> {
	public Bobbleheads2TileRenderer() {
		super(new Bobbleheads2BlockModel());
	}

	@Override
	public RenderType getRenderType(Bobbleheads2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
