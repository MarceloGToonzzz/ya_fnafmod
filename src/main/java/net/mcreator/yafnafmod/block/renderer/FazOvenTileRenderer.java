package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FazOvenBlockModel;
import net.mcreator.yafnafmod.block.entity.FazOvenTileEntity;

public class FazOvenTileRenderer extends GeoBlockRenderer<FazOvenTileEntity> {
	public FazOvenTileRenderer() {
		super(new FazOvenBlockModel());
	}

	@Override
	public RenderType getRenderType(FazOvenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
