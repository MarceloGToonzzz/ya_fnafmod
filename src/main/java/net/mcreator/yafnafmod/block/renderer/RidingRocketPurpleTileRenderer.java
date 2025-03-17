package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RidingRocketPurpleBlockModel;
import net.mcreator.yafnafmod.block.entity.RidingRocketPurpleTileEntity;

public class RidingRocketPurpleTileRenderer extends GeoBlockRenderer<RidingRocketPurpleTileEntity> {
	public RidingRocketPurpleTileRenderer() {
		super(new RidingRocketPurpleBlockModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketPurpleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
