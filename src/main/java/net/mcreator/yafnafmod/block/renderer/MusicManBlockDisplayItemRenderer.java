package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicManBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.MusicManBlockDisplayItem;

public class MusicManBlockDisplayItemRenderer extends GeoItemRenderer<MusicManBlockDisplayItem> {
	public MusicManBlockDisplayItemRenderer() {
		super(new MusicManBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(MusicManBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
