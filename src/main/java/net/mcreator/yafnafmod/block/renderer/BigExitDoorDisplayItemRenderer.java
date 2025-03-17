package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigExitDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigExitDoorDisplayItem;

public class BigExitDoorDisplayItemRenderer extends GeoItemRenderer<BigExitDoorDisplayItem> {
	public BigExitDoorDisplayItemRenderer() {
		super(new BigExitDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigExitDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
