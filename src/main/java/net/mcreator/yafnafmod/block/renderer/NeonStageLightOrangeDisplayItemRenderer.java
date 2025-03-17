package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonStageLightOrangeDisplayModel;
import net.mcreator.yafnafmod.block.display.NeonStageLightOrangeDisplayItem;

public class NeonStageLightOrangeDisplayItemRenderer extends GeoItemRenderer<NeonStageLightOrangeDisplayItem> {
	public NeonStageLightOrangeDisplayItemRenderer() {
		super(new NeonStageLightOrangeDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonStageLightOrangeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
