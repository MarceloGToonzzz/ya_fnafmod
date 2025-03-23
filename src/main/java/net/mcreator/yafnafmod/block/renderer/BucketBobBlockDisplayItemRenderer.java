package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BucketBobBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BucketBobBlockDisplayItem;

public class BucketBobBlockDisplayItemRenderer extends GeoItemRenderer<BucketBobBlockDisplayItem> {
	public BucketBobBlockDisplayItemRenderer() {
		super(new BucketBobBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BucketBobBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
