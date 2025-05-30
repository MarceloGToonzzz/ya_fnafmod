package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashCanFreddyDisplayModel;
import net.mcreator.yafnafmod.block.display.TrashCanFreddyDisplayItem;

public class TrashCanFreddyDisplayItemRenderer extends GeoItemRenderer<TrashCanFreddyDisplayItem> {
	public TrashCanFreddyDisplayItemRenderer() {
		super(new TrashCanFreddyDisplayModel());
	}

	@Override
	public RenderType getRenderType(TrashCanFreddyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
