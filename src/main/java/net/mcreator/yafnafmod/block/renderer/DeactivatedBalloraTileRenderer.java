package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DeactivatedBalloraBlockModel;
import net.mcreator.yafnafmod.block.entity.DeactivatedBalloraTileEntity;

public class DeactivatedBalloraTileRenderer extends GeoBlockRenderer<DeactivatedBalloraTileEntity> {
	public DeactivatedBalloraTileRenderer() {
		super(new DeactivatedBalloraBlockModel());
	}

	@Override
	public RenderType getRenderType(DeactivatedBalloraTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
