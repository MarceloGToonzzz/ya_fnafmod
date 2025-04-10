package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaBbBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DittophobiaBbBlockDisplayItem;

public class DittophobiaBbBlockDisplayItemRenderer extends GeoItemRenderer<DittophobiaBbBlockDisplayItem> {
	public DittophobiaBbBlockDisplayItemRenderer() {
		super(new DittophobiaBbBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaBbBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
