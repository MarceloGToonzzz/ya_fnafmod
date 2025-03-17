package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonStageLightPinkDisplayModel;
import net.mcreator.yafnafmod.block.display.NeonStageLightPinkDisplayItem;

public class NeonStageLightPinkDisplayItemRenderer extends GeoItemRenderer<NeonStageLightPinkDisplayItem> {
	public NeonStageLightPinkDisplayItemRenderer() {
		super(new NeonStageLightPinkDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightPinkDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
