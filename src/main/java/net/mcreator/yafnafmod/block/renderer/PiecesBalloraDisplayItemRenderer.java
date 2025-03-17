package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PiecesBalloraDisplayModel;
import net.mcreator.yafnafmod.block.display.PiecesBalloraDisplayItem;

public class PiecesBalloraDisplayItemRenderer extends GeoItemRenderer<PiecesBalloraDisplayItem> {
	public PiecesBalloraDisplayItemRenderer() {
		super(new PiecesBalloraDisplayModel());
	}

	@Override
	public RenderType getRenderType(PiecesBalloraDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
