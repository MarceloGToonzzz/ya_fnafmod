package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorTileEntity;

public class BigBackstageDoorTileRenderer extends GeoBlockRenderer<BigBackstageDoorTileEntity> {
	public BigBackstageDoorTileRenderer() {
		super(new BigBackstageDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
