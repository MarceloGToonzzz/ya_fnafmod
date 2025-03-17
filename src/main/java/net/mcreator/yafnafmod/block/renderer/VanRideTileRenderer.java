package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.VanRideBlockModel;
import net.mcreator.yafnafmod.block.entity.VanRideTileEntity;

public class VanRideTileRenderer extends GeoBlockRenderer<VanRideTileEntity> {
	public VanRideTileRenderer() {
		super(new VanRideBlockModel());
	}

	@Override
	public RenderType getRenderType(VanRideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
