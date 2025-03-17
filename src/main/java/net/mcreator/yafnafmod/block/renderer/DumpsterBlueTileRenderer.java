package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DumpsterBlueBlockModel;
import net.mcreator.yafnafmod.block.entity.DumpsterBlueTileEntity;

public class DumpsterBlueTileRenderer extends GeoBlockRenderer<DumpsterBlueTileEntity> {
	public DumpsterBlueTileRenderer() {
		super(new DumpsterBlueBlockModel());
	}

	@Override
	public RenderType getRenderType(DumpsterBlueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
