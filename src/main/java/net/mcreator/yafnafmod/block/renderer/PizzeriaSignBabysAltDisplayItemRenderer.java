package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignBabysAltDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignBabysAltDisplayItem;

public class PizzeriaSignBabysAltDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignBabysAltDisplayItem> {
	public PizzeriaSignBabysAltDisplayItemRenderer() {
		super(new PizzeriaSignBabysAltDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignBabysAltDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
