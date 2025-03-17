package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonnieHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.BonnieHeadTileEntity;

public class BonnieHeadTileRenderer extends GeoBlockRenderer<BonnieHeadTileEntity> {
	public BonnieHeadTileRenderer() {
		super(new BonnieHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnieHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
