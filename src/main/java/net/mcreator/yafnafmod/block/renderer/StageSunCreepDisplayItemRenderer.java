package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.StageSunCreepDisplayModel;
import net.mcreator.yafnafmod.block.display.StageSunCreepDisplayItem;

public class StageSunCreepDisplayItemRenderer extends GeoItemRenderer<StageSunCreepDisplayItem> {
	public StageSunCreepDisplayItemRenderer() {
		super(new StageSunCreepDisplayModel());
	}

	@Override
	public RenderType getRenderType(StageSunCreepDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
