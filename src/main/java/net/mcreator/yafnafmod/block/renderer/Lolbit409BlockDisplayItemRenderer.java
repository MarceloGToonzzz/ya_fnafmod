package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Lolbit409BlockDisplayModel;
import net.mcreator.yafnafmod.block.display.Lolbit409BlockDisplayItem;

public class Lolbit409BlockDisplayItemRenderer extends GeoItemRenderer<Lolbit409BlockDisplayItem> {
	public Lolbit409BlockDisplayItemRenderer() {
		super(new Lolbit409BlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(Lolbit409BlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
