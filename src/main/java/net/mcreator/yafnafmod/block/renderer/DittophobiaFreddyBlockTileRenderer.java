package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DittophobiaFreddyBlockTileEntity;

public class DittophobiaFreddyBlockTileRenderer extends GeoBlockRenderer<DittophobiaFreddyBlockTileEntity> {
	public DittophobiaFreddyBlockTileRenderer() {
		super(new DittophobiaFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
