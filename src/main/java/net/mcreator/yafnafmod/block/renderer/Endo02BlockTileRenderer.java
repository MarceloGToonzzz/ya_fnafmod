package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo02BlockBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo02BlockTileEntity;

public class Endo02BlockTileRenderer extends GeoBlockRenderer<Endo02BlockTileEntity> {
	public Endo02BlockTileRenderer() {
		super(new Endo02BlockBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo02BlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
