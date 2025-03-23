package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MrHugsBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.MrHugsBlockDisplayItem;

public class MrHugsBlockDisplayItemRenderer extends GeoItemRenderer<MrHugsBlockDisplayItem> {
	public MrHugsBlockDisplayItemRenderer() {
		super(new MrHugsBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(MrHugsBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
