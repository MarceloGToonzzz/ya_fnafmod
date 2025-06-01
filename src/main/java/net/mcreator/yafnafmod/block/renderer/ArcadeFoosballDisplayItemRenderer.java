package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeFoosballDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeFoosballDisplayItem;

public class ArcadeFoosballDisplayItemRenderer extends GeoItemRenderer<ArcadeFoosballDisplayItem> {
	public ArcadeFoosballDisplayItemRenderer() {
		super(new ArcadeFoosballDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeFoosballDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
