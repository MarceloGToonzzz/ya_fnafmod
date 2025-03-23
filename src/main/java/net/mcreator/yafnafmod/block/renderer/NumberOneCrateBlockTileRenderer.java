package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NumberOneCrateBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.NumberOneCrateBlockTileEntity;

public class NumberOneCrateBlockTileRenderer extends GeoBlockRenderer<NumberOneCrateBlockTileEntity> {
	public NumberOneCrateBlockTileRenderer() {
		super(new NumberOneCrateBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(NumberOneCrateBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
