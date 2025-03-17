package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonnieStandBlockModel;
import net.mcreator.yafnafmod.block.entity.BonnieStandTileEntity;

public class BonnieStandTileRenderer extends GeoBlockRenderer<BonnieStandTileEntity> {
	public BonnieStandTileRenderer() {
		super(new BonnieStandBlockModel());
	}

	@Override
	public RenderType getRenderType(BonnieStandTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
