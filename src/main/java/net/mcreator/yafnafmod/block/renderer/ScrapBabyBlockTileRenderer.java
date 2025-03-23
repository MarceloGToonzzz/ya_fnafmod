package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScrapBabyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ScrapBabyBlockTileEntity;

public class ScrapBabyBlockTileRenderer extends GeoBlockRenderer<ScrapBabyBlockTileEntity> {
	public ScrapBabyBlockTileRenderer() {
		super(new ScrapBabyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ScrapBabyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
