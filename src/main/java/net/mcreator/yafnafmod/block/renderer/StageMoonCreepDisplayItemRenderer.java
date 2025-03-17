package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageMoonCreepDisplayModel;
import net.mcreator.yafnafmod.block.display.StageMoonCreepDisplayItem;

public class StageMoonCreepDisplayItemRenderer extends GeoItemRenderer<StageMoonCreepDisplayItem> {
	public StageMoonCreepDisplayItemRenderer() {
		super(new StageMoonCreepDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageMoonCreepDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
