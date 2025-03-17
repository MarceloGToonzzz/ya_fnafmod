package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigEntranceRedDoorTileEntity;

public class BigEntranceRedDoorTileRenderer extends GeoBlockRenderer<BigEntranceRedDoorTileEntity> {
	public BigEntranceRedDoorTileRenderer() {
		super(new BigEntranceRedDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
