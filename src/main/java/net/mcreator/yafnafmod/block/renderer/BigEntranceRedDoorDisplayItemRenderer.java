package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntranceRedDoorDisplayItem;

public class BigEntranceRedDoorDisplayItemRenderer extends GeoItemRenderer<BigEntranceRedDoorDisplayItem> {
	public BigEntranceRedDoorDisplayItemRenderer() {
		super(new BigEntranceRedDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
