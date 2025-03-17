package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BreakerControlBlockModel;
import net.mcreator.yafnafmod.block.entity.BreakerControlTileEntity;

public class BreakerControlTileRenderer extends GeoBlockRenderer<BreakerControlTileEntity> {
	public BreakerControlTileRenderer() {
		super(new BreakerControlBlockModel());
	}

	@Override
	public RenderType getRenderType(BreakerControlTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
