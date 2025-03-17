package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MrHippoBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.MrHippoBlockDisplayItem;

public class MrHippoBlockDisplayItemRenderer extends GeoItemRenderer<MrHippoBlockDisplayItem> {
	public MrHippoBlockDisplayItemRenderer() {
		super(new MrHippoBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(MrHippoBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
