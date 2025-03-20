package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigElevatorDoorBlockModel;
import net.mcreator.yafnafmod.block.entity.BigElevatorDoorTileEntity;

public class BigElevatorDoorTileRenderer extends GeoBlockRenderer<BigElevatorDoorTileEntity> {
	public BigElevatorDoorTileRenderer() {
		super(new BigElevatorDoorBlockModel());
	}

	@Override
	public RenderType getRenderType(BigElevatorDoorTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
