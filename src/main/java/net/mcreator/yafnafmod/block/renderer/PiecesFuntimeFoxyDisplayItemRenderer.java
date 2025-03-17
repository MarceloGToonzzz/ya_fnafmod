package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PiecesFuntimeFoxyDisplayModel;
import net.mcreator.yafnafmod.block.display.PiecesFuntimeFoxyDisplayItem;

public class PiecesFuntimeFoxyDisplayItemRenderer extends GeoItemRenderer<PiecesFuntimeFoxyDisplayItem> {
	public PiecesFuntimeFoxyDisplayItemRenderer() {
		super(new PiecesFuntimeFoxyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PiecesFuntimeFoxyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
