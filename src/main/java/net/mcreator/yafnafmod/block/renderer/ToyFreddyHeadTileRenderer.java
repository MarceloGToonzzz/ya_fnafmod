package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyFreddyHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyFreddyHeadTileEntity;

public class ToyFreddyHeadTileRenderer extends GeoBlockRenderer<ToyFreddyHeadTileEntity> {
	public ToyFreddyHeadTileRenderer() {
		super(new ToyFreddyHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyFreddyHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
