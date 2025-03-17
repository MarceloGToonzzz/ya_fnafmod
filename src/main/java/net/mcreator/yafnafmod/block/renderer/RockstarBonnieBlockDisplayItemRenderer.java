package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarBonnieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.RockstarBonnieBlockDisplayItem;

public class RockstarBonnieBlockDisplayItemRenderer extends GeoItemRenderer<RockstarBonnieBlockDisplayItem> {
	public RockstarBonnieBlockDisplayItemRenderer() {
		super(new RockstarBonnieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(RockstarBonnieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
