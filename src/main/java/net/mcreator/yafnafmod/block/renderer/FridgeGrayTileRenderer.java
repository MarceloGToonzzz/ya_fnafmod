package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FridgeGrayBlockModel;
import net.mcreator.yafnafmod.block.entity.FridgeGrayTileEntity;

public class FridgeGrayTileRenderer extends GeoBlockRenderer<FridgeGrayTileEntity> {
	public FridgeGrayTileRenderer() {
		super(new FridgeGrayBlockModel());
	}

	@Override
	public RenderType getRenderType(FridgeGrayTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
