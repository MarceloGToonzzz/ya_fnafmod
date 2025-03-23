package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LolbitBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.LolbitBlockDisplayItem;

public class LolbitBlockDisplayItemRenderer extends GeoItemRenderer<LolbitBlockDisplayItem> {
	public LolbitBlockDisplayItemRenderer() {
		super(new LolbitBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(LolbitBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
