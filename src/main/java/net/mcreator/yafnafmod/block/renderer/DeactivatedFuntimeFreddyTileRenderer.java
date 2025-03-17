package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeactivatedFuntimeFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.DeactivatedFuntimeFreddyTileEntity;

public class DeactivatedFuntimeFreddyTileRenderer extends GeoBlockRenderer<DeactivatedFuntimeFreddyTileEntity> {
	public DeactivatedFuntimeFreddyTileRenderer() {
		super(new DeactivatedFuntimeFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(DeactivatedFuntimeFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
