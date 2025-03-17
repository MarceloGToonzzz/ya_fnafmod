package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CircusControlTopBlockModel;
import net.mcreator.yafnafmod.block.entity.CircusControlTopTileEntity;

public class CircusControlTopTileRenderer extends GeoBlockRenderer<CircusControlTopTileEntity> {
	public CircusControlTopTileRenderer() {
		super(new CircusControlTopBlockModel());
	}

	@Override
	public RenderType getRenderType(CircusControlTopTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
