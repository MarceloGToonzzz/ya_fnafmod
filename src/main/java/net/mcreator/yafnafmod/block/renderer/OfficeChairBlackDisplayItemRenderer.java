package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OfficeChairBlackDisplayModel;
import net.mcreator.yafnafmod.block.display.OfficeChairBlackDisplayItem;

public class OfficeChairBlackDisplayItemRenderer extends GeoItemRenderer<OfficeChairBlackDisplayItem> {
	public OfficeChairBlackDisplayItemRenderer() {
		super(new OfficeChairBlackDisplayModel());
	}

	@Override
	public RenderType getRenderType(OfficeChairBlackDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
