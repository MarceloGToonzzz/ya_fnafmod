package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OfficeChairRedDisplayModel;
import net.mcreator.yafnafmod.block.display.OfficeChairRedDisplayItem;

public class OfficeChairRedDisplayItemRenderer extends GeoItemRenderer<OfficeChairRedDisplayItem> {
	public OfficeChairRedDisplayItemRenderer() {
		super(new OfficeChairRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(OfficeChairRedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
