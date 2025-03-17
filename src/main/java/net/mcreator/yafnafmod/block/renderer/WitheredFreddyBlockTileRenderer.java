package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredFreddyBlockTileEntity;

public class WitheredFreddyBlockTileRenderer extends GeoBlockRenderer<WitheredFreddyBlockTileEntity> {
	public WitheredFreddyBlockTileRenderer() {
		super(new WitheredFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
