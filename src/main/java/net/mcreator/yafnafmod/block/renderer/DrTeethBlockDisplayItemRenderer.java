package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DrTeethBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DrTeethBlockDisplayItem;

public class DrTeethBlockDisplayItemRenderer extends GeoItemRenderer<DrTeethBlockDisplayItem> {
	public DrTeethBlockDisplayItemRenderer() {
		super(new DrTeethBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DrTeethBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
