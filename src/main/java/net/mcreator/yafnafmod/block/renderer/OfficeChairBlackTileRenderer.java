package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OfficeChairBlackBlockModel;
import net.mcreator.yafnafmod.block.entity.OfficeChairBlackTileEntity;

public class OfficeChairBlackTileRenderer extends GeoBlockRenderer<OfficeChairBlackTileEntity> {
	public OfficeChairBlackTileRenderer() {
		super(new OfficeChairBlackBlockModel());
	}

	@Override
	public RenderType getRenderType(OfficeChairBlackTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
