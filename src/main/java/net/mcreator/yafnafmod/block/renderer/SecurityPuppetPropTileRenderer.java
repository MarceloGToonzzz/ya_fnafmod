package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SecurityPuppetPropBlockModel;
import net.mcreator.yafnafmod.block.entity.SecurityPuppetPropTileEntity;

public class SecurityPuppetPropTileRenderer extends GeoBlockRenderer<SecurityPuppetPropTileEntity> {
	public SecurityPuppetPropTileRenderer() {
		super(new SecurityPuppetPropBlockModel());
	}

	@Override
	public RenderType getRenderType(SecurityPuppetPropTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
