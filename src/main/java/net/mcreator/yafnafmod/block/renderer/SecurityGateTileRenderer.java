package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SecurityGateBlockModel;
import net.mcreator.yafnafmod.block.entity.SecurityGateTileEntity;

public class SecurityGateTileRenderer extends GeoBlockRenderer<SecurityGateTileEntity> {
	public SecurityGateTileRenderer() {
		super(new SecurityGateBlockModel());
	}

	@Override
	public RenderType getRenderType(SecurityGateTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
