package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BrokenFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.BrokenFreddyTileEntity;

public class BrokenFreddyTileRenderer extends GeoBlockRenderer<BrokenFreddyTileEntity> {
	public BrokenFreddyTileRenderer() {
		super(new BrokenFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(BrokenFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
