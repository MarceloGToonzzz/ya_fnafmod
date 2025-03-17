package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarnivalHoopsBlockModel;
import net.mcreator.yafnafmod.block.entity.CarnivalHoopsTileEntity;

public class CarnivalHoopsTileRenderer extends GeoBlockRenderer<CarnivalHoopsTileEntity> {
	public CarnivalHoopsTileRenderer() {
		super(new CarnivalHoopsBlockModel());
	}

	@Override
	public RenderType getRenderType(CarnivalHoopsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
