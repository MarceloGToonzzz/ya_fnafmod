package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MrCanDoBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.MrCanDoBlockTileEntity;

public class MrCanDoBlockTileRenderer extends GeoBlockRenderer<MrCanDoBlockTileEntity> {
	public MrCanDoBlockTileRenderer() {
		super(new MrCanDoBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(MrCanDoBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
