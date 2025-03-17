package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedDoorWideBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedDoorWideTileEntity;

public class BigEntranceRedDoorWideTileRenderer extends GeoBlockRenderer<BigEntranceRedDoorWideTileEntity> {
	public BigEntranceRedDoorWideTileRenderer() {
		super(new BigEntranceRedDoorWideBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedDoorWideTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
