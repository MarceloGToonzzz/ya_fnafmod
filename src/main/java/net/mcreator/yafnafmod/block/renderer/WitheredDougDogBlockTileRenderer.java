package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredDougDogBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredDougDogBlockTileEntity;

public class WitheredDougDogBlockTileRenderer extends GeoBlockRenderer<WitheredDougDogBlockTileEntity> {
	public WitheredDougDogBlockTileRenderer() {
		super(new WitheredDougDogBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredDougDogBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
