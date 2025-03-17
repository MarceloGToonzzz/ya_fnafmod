package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarChicaBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RockstarChicaBlockTileEntity;

public class RockstarChicaBlockTileRenderer extends GeoBlockRenderer<RockstarChicaBlockTileEntity> {
	public RockstarChicaBlockTileRenderer() {
		super(new RockstarChicaBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RockstarChicaBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
