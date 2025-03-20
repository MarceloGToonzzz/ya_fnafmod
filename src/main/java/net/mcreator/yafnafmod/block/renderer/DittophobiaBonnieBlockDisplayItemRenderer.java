package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaBonnieBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.DittophobiaBonnieBlockDisplayItem;

public class DittophobiaBonnieBlockDisplayItemRenderer extends GeoItemRenderer<DittophobiaBonnieBlockDisplayItem> {
	public DittophobiaBonnieBlockDisplayItemRenderer() {
		super(new DittophobiaBonnieBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaBonnieBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
