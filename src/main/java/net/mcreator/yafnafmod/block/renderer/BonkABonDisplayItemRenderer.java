package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonkABonDisplayModel;
import net.mcreator.yafnafmod.block.display.BonkABonDisplayItem;

public class BonkABonDisplayItemRenderer extends GeoItemRenderer<BonkABonDisplayItem> {
	public BonkABonDisplayItemRenderer() {
		super(new BonkABonDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonkABonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
