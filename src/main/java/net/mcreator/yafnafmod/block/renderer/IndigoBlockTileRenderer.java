package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.IndigoBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.IndigoBlockTileEntity;

public class IndigoBlockTileRenderer extends GeoBlockRenderer<IndigoBlockTileEntity> {
	public IndigoBlockTileRenderer() {
		super(new IndigoBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(IndigoBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
