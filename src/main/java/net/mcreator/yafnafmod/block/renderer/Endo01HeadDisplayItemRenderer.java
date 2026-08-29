package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo01HeadDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo01HeadDisplayItem;

public class Endo01HeadDisplayItemRenderer extends GeoItemRenderer<Endo01HeadDisplayItem> {
	public Endo01HeadDisplayItemRenderer() {
		super(new Endo01HeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo01HeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
