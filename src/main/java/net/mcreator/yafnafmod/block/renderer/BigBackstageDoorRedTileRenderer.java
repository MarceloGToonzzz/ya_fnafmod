package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigBackstageDoorRedBlockModel;
import net.mcreator.yafnafmod.block.entity.BigBackstageDoorRedTileEntity;

public class BigBackstageDoorRedTileRenderer extends GeoBlockRenderer<BigBackstageDoorRedTileEntity> {
	public BigBackstageDoorRedTileRenderer() {
		super(new BigBackstageDoorRedBlockModel());
	}

	@Override
	public RenderType getRenderType(BigBackstageDoorRedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
