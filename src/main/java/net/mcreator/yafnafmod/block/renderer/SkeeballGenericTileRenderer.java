package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SkeeballGenericBlockModel;
import net.mcreator.yafnafmod.block.entity.SkeeballGenericTileEntity;

public class SkeeballGenericTileRenderer extends GeoBlockRenderer<SkeeballGenericTileEntity> {
	public SkeeballGenericTileRenderer() {
		super(new SkeeballGenericBlockModel());
	}

	@Override
	public RenderType getRenderType(SkeeballGenericTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
