package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigElevatorDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigElevatorDoorDisplayItem;

public class BigElevatorDoorDisplayItemRenderer extends GeoItemRenderer<BigElevatorDoorDisplayItem> {
	public BigElevatorDoorDisplayItemRenderer() {
		super(new BigElevatorDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigElevatorDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
