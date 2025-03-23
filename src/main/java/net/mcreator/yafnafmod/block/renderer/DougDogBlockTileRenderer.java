package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DougDogBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DougDogBlockTileEntity;

public class DougDogBlockTileRenderer extends GeoBlockRenderer<DougDogBlockTileEntity> {
	public DougDogBlockTileRenderer() {
		super(new DougDogBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DougDogBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
