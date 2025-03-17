package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyFreddyBlockTileEntity;

public class ToyFreddyBlockTileRenderer extends GeoBlockRenderer<ToyFreddyBlockTileEntity> {
	public ToyFreddyBlockTileRenderer() {
		super(new ToyFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
