package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OfficeChairRedBlockModel;
import net.mcreator.yafnafmod.block.entity.OfficeChairRedTileEntity;

public class OfficeChairRedTileRenderer extends GeoBlockRenderer<OfficeChairRedTileEntity> {
	public OfficeChairRedTileRenderer() {
		super(new OfficeChairRedBlockModel());
	}

	@Override
	public RenderType getRenderType(OfficeChairRedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
