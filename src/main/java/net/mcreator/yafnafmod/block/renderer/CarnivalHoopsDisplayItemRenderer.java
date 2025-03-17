package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarnivalHoopsDisplayModel;
import net.mcreator.yafnafmod.block.display.CarnivalHoopsDisplayItem;

public class CarnivalHoopsDisplayItemRenderer extends GeoItemRenderer<CarnivalHoopsDisplayItem> {
	public CarnivalHoopsDisplayItemRenderer() {
		super(new CarnivalHoopsDisplayModel());
	}

	@Override
	public RenderType getRenderType(CarnivalHoopsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
