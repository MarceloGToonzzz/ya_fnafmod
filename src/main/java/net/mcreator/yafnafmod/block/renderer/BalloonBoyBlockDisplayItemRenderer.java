package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BalloonBoyBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.BalloonBoyBlockDisplayItem;

public class BalloonBoyBlockDisplayItemRenderer extends GeoItemRenderer<BalloonBoyBlockDisplayItem> {
	public BalloonBoyBlockDisplayItemRenderer() {
		super(new BalloonBoyBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BalloonBoyBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
