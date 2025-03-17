package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FridgeWhiteBlockModel;
import net.mcreator.yafnafmod.block.entity.FridgeWhiteTileEntity;

public class FridgeWhiteTileRenderer extends GeoBlockRenderer<FridgeWhiteTileEntity> {
	public FridgeWhiteTileRenderer() {
		super(new FridgeWhiteBlockModel());
	}

	@Override
	public RenderType getRenderType(FridgeWhiteTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
