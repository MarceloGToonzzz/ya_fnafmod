package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MedicalStationDisplayModel;
import net.mcreator.yafnafmod.block.display.MedicalStationDisplayItem;

public class MedicalStationDisplayItemRenderer extends GeoItemRenderer<MedicalStationDisplayItem> {
	public MedicalStationDisplayItemRenderer() {
		super(new MedicalStationDisplayModel());
	}

	@Override
	public RenderType getRenderType(MedicalStationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
