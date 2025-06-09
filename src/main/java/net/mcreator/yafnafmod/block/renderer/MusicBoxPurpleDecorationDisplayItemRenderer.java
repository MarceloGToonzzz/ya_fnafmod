package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MusicBoxPurpleDecorationDisplayModel;
import net.mcreator.yafnafmod.block.display.MusicBoxPurpleDecorationDisplayItem;

public class MusicBoxPurpleDecorationDisplayItemRenderer extends GeoItemRenderer<MusicBoxPurpleDecorationDisplayItem> {
	public MusicBoxPurpleDecorationDisplayItemRenderer() {
		super(new MusicBoxPurpleDecorationDisplayModel());
	}

	@Override
	public RenderType getRenderType(MusicBoxPurpleDecorationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
