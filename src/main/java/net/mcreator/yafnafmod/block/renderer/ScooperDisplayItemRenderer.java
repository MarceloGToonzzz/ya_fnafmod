package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScooperDisplayModel;
import net.mcreator.yafnafmod.block.display.ScooperDisplayItem;

public class ScooperDisplayItemRenderer extends GeoItemRenderer<ScooperDisplayItem> {
	public ScooperDisplayItemRenderer() {
		super(new ScooperDisplayModel());
	}

	@Override
	public RenderType getRenderType(ScooperDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
