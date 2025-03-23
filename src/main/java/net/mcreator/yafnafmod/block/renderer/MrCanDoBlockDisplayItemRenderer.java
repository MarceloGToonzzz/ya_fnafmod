package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MrCanDoBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.MrCanDoBlockDisplayItem;

public class MrCanDoBlockDisplayItemRenderer extends GeoItemRenderer<MrCanDoBlockDisplayItem> {
	public MrCanDoBlockDisplayItemRenderer() {
		super(new MrCanDoBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(MrCanDoBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
