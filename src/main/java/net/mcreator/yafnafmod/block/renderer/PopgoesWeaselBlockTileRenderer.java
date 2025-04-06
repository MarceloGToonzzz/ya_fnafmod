package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PopgoesWeaselBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.PopgoesWeaselBlockTileEntity;

public class PopgoesWeaselBlockTileRenderer extends GeoBlockRenderer<PopgoesWeaselBlockTileEntity> {
	public PopgoesWeaselBlockTileRenderer() {
		super(new PopgoesWeaselBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(PopgoesWeaselBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
