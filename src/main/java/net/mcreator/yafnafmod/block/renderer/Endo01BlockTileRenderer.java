package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01BlockBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo01BlockTileEntity;

public class Endo01BlockTileRenderer extends GeoBlockRenderer<Endo01BlockTileEntity> {
	public Endo01BlockTileRenderer() {
		super(new Endo01BlockBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01BlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
