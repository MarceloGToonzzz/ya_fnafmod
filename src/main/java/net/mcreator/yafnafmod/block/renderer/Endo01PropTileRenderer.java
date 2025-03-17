package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01PropBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo01PropTileEntity;

public class Endo01PropTileRenderer extends GeoBlockRenderer<Endo01PropTileEntity> {
	public Endo01PropTileRenderer() {
		super(new Endo01PropBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo01PropTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
