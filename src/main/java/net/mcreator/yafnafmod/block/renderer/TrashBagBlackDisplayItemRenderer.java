package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashBagBlackDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashBagBlackDisplayItem;

public class TrashBagBlackDisplayItemRenderer extends GeoItemRenderer<TrashBagBlackDisplayItem> {
	public TrashBagBlackDisplayItemRenderer() {
		super(new TrashBagBlackDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashBagBlackDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
