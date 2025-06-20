package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeRacingBlueDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeRacingBlueDisplayItem;

public class ArcadeRacingBlueDisplayItemRenderer extends GeoItemRenderer<ArcadeRacingBlueDisplayItem> {
	public ArcadeRacingBlueDisplayItemRenderer() {
		super(new ArcadeRacingBlueDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeRacingBlueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
