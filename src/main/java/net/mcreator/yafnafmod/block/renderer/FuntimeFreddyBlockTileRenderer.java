package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FuntimeFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FuntimeFreddyBlockTileEntity;

public class FuntimeFreddyBlockTileRenderer extends GeoBlockRenderer<FuntimeFreddyBlockTileEntity> {
	public FuntimeFreddyBlockTileRenderer() {
		super(new FuntimeFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FuntimeFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
