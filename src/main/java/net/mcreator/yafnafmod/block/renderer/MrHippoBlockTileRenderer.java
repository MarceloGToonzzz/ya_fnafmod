package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MrHippoBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.MrHippoBlockTileEntity;

public class MrHippoBlockTileRenderer extends GeoBlockRenderer<MrHippoBlockTileEntity> {
	public MrHippoBlockTileRenderer() {
		super(new MrHippoBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(MrHippoBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
