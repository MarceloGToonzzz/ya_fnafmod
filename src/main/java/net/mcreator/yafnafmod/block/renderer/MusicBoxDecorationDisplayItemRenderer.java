package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicBoxDecorationDisplayModel;
import net.mcreator.yafnafmod.block.display.MusicBoxDecorationDisplayItem;

public class MusicBoxDecorationDisplayItemRenderer extends GeoItemRenderer<MusicBoxDecorationDisplayItem> {
	public MusicBoxDecorationDisplayItemRenderer() {
		super(new MusicBoxDecorationDisplayModel());
	}

	@Override
	public RenderType getRenderType(MusicBoxDecorationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
