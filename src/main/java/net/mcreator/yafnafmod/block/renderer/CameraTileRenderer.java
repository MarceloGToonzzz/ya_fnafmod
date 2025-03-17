package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CameraBlockModel;
import net.mcreator.yafnafmod.block.entity.CameraTileEntity;

public class CameraTileRenderer extends GeoBlockRenderer<CameraTileEntity> {
	public CameraTileRenderer() {
		super(new CameraBlockModel());
	}

	@Override
	public RenderType getRenderType(CameraTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
