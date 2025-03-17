package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigEntranceRedDoorWideDisplayModel;
import net.mcreator.yafnafmod.block.display.BigEntranceRedDoorWideDisplayItem;

public class BigEntranceRedDoorWideDisplayItemRenderer extends GeoItemRenderer<BigEntranceRedDoorWideDisplayItem> {
	public BigEntranceRedDoorWideDisplayItemRenderer() {
		super(new BigEntranceRedDoorWideDisplayModel());
	}

	@Override
	public RenderType getRenderType(BigEntranceRedDoorWideDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
