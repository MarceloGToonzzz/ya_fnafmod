package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PotBlockModel;
import net.mcreator.yafnafmod.block.entity.PotTileEntity;

public class PotTileRenderer extends GeoBlockRenderer<PotTileEntity> {
	public PotTileRenderer() {
		super(new PotBlockModel());
	}

	@Override
	public RenderType getRenderType(PotTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
