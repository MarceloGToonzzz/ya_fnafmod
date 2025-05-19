package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShreddyFazchairBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.ShreddyFazchairBlockDisplayItem;

public class ShreddyFazchairBlockDisplayItemRenderer extends GeoItemRenderer<ShreddyFazchairBlockDisplayItem> {
	public ShreddyFazchairBlockDisplayItemRenderer() {
		super(new ShreddyFazchairBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShreddyFazchairBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
