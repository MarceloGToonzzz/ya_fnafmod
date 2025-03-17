package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PartsBoxBlockModel;
import net.mcreator.yafnafmod.block.entity.PartsBoxTileEntity;

public class PartsBoxTileRenderer extends GeoBlockRenderer<PartsBoxTileEntity> {
	public PartsBoxTileRenderer() {
		super(new PartsBoxBlockModel());
	}

	@Override
	public RenderType getRenderType(PartsBoxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
