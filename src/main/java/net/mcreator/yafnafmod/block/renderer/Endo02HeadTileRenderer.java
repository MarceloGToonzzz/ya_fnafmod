package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo02HeadBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo02HeadTileEntity;

public class Endo02HeadTileRenderer extends GeoBlockRenderer<Endo02HeadTileEntity> {
	public Endo02HeadTileRenderer() {
		super(new Endo02HeadBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo02HeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
