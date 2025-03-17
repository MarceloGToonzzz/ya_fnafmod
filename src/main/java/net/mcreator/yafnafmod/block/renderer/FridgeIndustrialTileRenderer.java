package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FridgeIndustrialBlockModel;
import net.mcreator.yafnafmod.block.entity.FridgeIndustrialTileEntity;

public class FridgeIndustrialTileRenderer extends GeoBlockRenderer<FridgeIndustrialTileEntity> {
	public FridgeIndustrialTileRenderer() {
		super(new FridgeIndustrialBlockModel());
	}

	@Override
	public RenderType getRenderType(FridgeIndustrialTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
