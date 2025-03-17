package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FoxyPirateFixedBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.FoxyPirateFixedBlockDisplayItem;

public class FoxyPirateFixedBlockDisplayItemRenderer extends GeoItemRenderer<FoxyPirateFixedBlockDisplayItem> {
	public FoxyPirateFixedBlockDisplayItemRenderer() {
		super(new FoxyPirateFixedBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(FoxyPirateFixedBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
