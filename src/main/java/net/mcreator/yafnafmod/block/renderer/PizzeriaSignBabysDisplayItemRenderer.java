package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignBabysDisplayModel;
import net.mcreator.yafnafmod.block.display.PizzeriaSignBabysDisplayItem;

public class PizzeriaSignBabysDisplayItemRenderer extends GeoItemRenderer<PizzeriaSignBabysDisplayItem> {
	public PizzeriaSignBabysDisplayItemRenderer() {
		super(new PizzeriaSignBabysDisplayModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignBabysDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
