package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageRedDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageRedDoorWideTileEntity;

public class BigBackstageRedDoorWideTileRenderer extends GeoBlockRenderer<BigBackstageRedDoorWideTileEntity> {
	public BigBackstageRedDoorWideTileRenderer() {
		super(new BigBackstageRedDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageRedDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
