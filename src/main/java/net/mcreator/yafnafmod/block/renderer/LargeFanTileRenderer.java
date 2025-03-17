package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LargeFanBlockModel;
import net.mcreator.yafnafmod.block.entity.LargeFanTileEntity;

public class LargeFanTileRenderer extends GeoBlockRenderer<LargeFanTileEntity> {
	public LargeFanTileRenderer() {
		super(new LargeFanBlockModel());
	}

	@Override
	public RenderType getRenderType(LargeFanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
