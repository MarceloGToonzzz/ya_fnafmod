package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NoveltyTrafficLightBlockModel;
import net.mcreator.yafnafmod.block.entity.NoveltyTrafficLightTileEntity;

public class NoveltyTrafficLightTileRenderer extends GeoBlockRenderer<NoveltyTrafficLightTileEntity> {
	public NoveltyTrafficLightTileRenderer() {
		super(new NoveltyTrafficLightBlockModel());
	}

	@Override
	public RenderType getRenderType(NoveltyTrafficLightTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
