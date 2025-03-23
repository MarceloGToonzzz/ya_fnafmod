package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredBonbonBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.WitheredBonbonBlockDisplayItem;

public class WitheredBonbonBlockDisplayItemRenderer extends GeoItemRenderer<WitheredBonbonBlockDisplayItem> {
	public WitheredBonbonBlockDisplayItemRenderer() {
		super(new WitheredBonbonBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredBonbonBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
