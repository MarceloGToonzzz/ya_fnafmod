package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LaptopBlockModel;
import net.mcreator.yafnafmod.block.entity.LaptopTileEntity;

public class LaptopTileRenderer extends GeoBlockRenderer<LaptopTileEntity> {
	public LaptopTileRenderer() {
		super(new LaptopBlockModel());
	}

	@Override
	public RenderType getRenderType(LaptopTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
