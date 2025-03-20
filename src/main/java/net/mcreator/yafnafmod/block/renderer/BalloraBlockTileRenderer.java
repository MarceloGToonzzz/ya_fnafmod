package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BalloraBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BalloraBlockTileEntity;

public class BalloraBlockTileRenderer extends GeoBlockRenderer<BalloraBlockTileEntity> {
	public BalloraBlockTileRenderer() {
		super(new BalloraBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BalloraBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
