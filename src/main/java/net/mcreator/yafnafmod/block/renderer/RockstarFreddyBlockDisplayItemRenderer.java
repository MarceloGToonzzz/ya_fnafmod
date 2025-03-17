package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarFreddyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RockstarFreddyBlockDisplayItem;

public class RockstarFreddyBlockDisplayItemRenderer extends GeoItemRenderer<RockstarFreddyBlockDisplayItem> {
	public RockstarFreddyBlockDisplayItemRenderer() {
		super(new RockstarFreddyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockstarFreddyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
