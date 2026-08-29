package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01HeadBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo01HeadTileEntity;

public class Endo01HeadTileRenderer extends GeoBlockRenderer<Endo01HeadTileEntity> {
	public Endo01HeadTileRenderer() {
		super(new Endo01HeadBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01HeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
