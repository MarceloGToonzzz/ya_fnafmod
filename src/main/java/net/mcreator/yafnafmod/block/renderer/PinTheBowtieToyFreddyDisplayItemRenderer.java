package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinTheBowtieToyFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.PinTheBowtieToyFreddyDisplayItem;

public class PinTheBowtieToyFreddyDisplayItemRenderer extends GeoItemRenderer<PinTheBowtieToyFreddyDisplayItem> {
	public PinTheBowtieToyFreddyDisplayItemRenderer() {
		super(new PinTheBowtieToyFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieToyFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
