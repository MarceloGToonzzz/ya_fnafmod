package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeRacingPinkDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeRacingPinkDisplayItem;

public class ArcadeRacingPinkDisplayItemRenderer extends GeoItemRenderer<ArcadeRacingPinkDisplayItem> {
	public ArcadeRacingPinkDisplayItemRenderer() {
		super(new ArcadeRacingPinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeRacingPinkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
