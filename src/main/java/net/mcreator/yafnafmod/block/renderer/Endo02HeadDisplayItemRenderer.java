package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo02HeadDisplayModel;
import net.mcreator.yafnafmod.block.display.Endo02HeadDisplayItem;

public class Endo02HeadDisplayItemRenderer extends GeoItemRenderer<Endo02HeadDisplayItem> {
	public Endo02HeadDisplayItemRenderer() {
		super(new Endo02HeadDisplayModel());
	}

	@Override
	public RenderType getRenderType(Endo02HeadDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
