package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BlastSecurityDoorDisplayModel;
import net.mcreator.yafnafmod.block.display.BlastSecurityDoorDisplayItem;

public class BlastSecurityDoorDisplayItemRenderer extends GeoItemRenderer<BlastSecurityDoorDisplayItem> {
	public BlastSecurityDoorDisplayItemRenderer() {
		super(new BlastSecurityDoorDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlastSecurityDoorDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
