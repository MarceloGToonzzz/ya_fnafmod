package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RidingRocketRedBlockModel;
import net.mcreator.yafnafmod.block.entity.RidingRocketRedTileEntity;

public class RidingRocketRedTileRenderer extends GeoBlockRenderer<RidingRocketRedTileEntity> {
	public RidingRocketRedTileRenderer() {
		super(new RidingRocketRedBlockModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketRedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
