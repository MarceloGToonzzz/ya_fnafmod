package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToypugBlockModel;
import net.mcreator.yafnafmod.block.entity.ToypugTileEntity;

public class ToypugTileRenderer extends GeoBlockRenderer<ToypugTileEntity> {
	public ToypugTileRenderer() {
		super(new ToypugBlockModel());
	}

	@Override
	public RenderType getRenderType(ToypugTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
