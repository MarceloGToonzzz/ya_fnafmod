package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DumpsterGreenBlockModel;
import net.mcreator.yafnafmod.block.entity.DumpsterGreenTileEntity;

public class DumpsterGreenTileRenderer extends GeoBlockRenderer<DumpsterGreenTileEntity> {
	public DumpsterGreenTileRenderer() {
		super(new DumpsterGreenBlockModel());
	}

	@Override
	public RenderType getRenderType(DumpsterGreenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
