package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutHelpyDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutHelpyDisplayItem;

public class CutoutHelpyDisplayItemRenderer extends GeoItemRenderer<CutoutHelpyDisplayItem> {
	public CutoutHelpyDisplayItemRenderer() {
		super(new CutoutHelpyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutHelpyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
