package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeddbearBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.NeddbearBlockDisplayItem;

public class NeddbearBlockDisplayItemRenderer extends GeoItemRenderer<NeddbearBlockDisplayItem> {
	public NeddbearBlockDisplayItemRenderer() {
		super(new NeddbearBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeddbearBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
