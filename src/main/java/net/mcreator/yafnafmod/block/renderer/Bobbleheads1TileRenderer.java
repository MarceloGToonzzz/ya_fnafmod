package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Bobbleheads1BlockModel;
import net.mcreator.yafnafmod.block.entity.Bobbleheads1TileEntity;

public class Bobbleheads1TileRenderer extends GeoBlockRenderer<Bobbleheads1TileEntity> {
	public Bobbleheads1TileRenderer() {
		super(new Bobbleheads1BlockModel());
	}

	@Override
	public RenderType getRenderType(Bobbleheads1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
