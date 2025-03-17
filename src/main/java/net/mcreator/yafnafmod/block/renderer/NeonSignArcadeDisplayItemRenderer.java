package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignArcadeDisplayModel;
import net.mcreator.yafnafmod.block.display.NeonSignArcadeDisplayItem;

public class NeonSignArcadeDisplayItemRenderer extends GeoItemRenderer<NeonSignArcadeDisplayItem> {
	public NeonSignArcadeDisplayItemRenderer() {
		super(new NeonSignArcadeDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonSignArcadeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
