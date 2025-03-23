package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PanStanBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.PanStanBlockTileEntity;

public class PanStanBlockTileRenderer extends GeoBlockRenderer<PanStanBlockTileEntity> {
	public PanStanBlockTileRenderer() {
		super(new PanStanBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(PanStanBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
