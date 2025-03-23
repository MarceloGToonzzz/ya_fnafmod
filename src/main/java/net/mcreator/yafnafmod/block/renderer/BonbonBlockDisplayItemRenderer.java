package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonbonBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BonbonBlockDisplayItem;

public class BonbonBlockDisplayItemRenderer extends GeoItemRenderer<BonbonBlockDisplayItem> {
	public BonbonBlockDisplayItemRenderer() {
		super(new BonbonBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BonbonBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
