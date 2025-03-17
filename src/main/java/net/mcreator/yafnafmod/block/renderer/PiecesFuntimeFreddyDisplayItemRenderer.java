package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PiecesFuntimeFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.PiecesFuntimeFreddyDisplayItem;

public class PiecesFuntimeFreddyDisplayItemRenderer extends GeoItemRenderer<PiecesFuntimeFreddyDisplayItem> {
	public PiecesFuntimeFreddyDisplayItemRenderer() {
		super(new PiecesFuntimeFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(PiecesFuntimeFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
