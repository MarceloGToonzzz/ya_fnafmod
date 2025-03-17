package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LaptopOldBlockModel;
import net.mcreator.yafnafmod.block.entity.LaptopOldTileEntity;

public class LaptopOldTileRenderer extends GeoBlockRenderer<LaptopOldTileEntity> {
	public LaptopOldTileRenderer() {
		super(new LaptopOldBlockModel());
	}

	@Override
	public RenderType getRenderType(LaptopOldTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
