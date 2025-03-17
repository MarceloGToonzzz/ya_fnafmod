package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ScooperBlockModel;
import net.mcreator.yafnafmod.block.entity.ScooperTileEntity;

public class ScooperTileRenderer extends GeoBlockRenderer<ScooperTileEntity> {
	public ScooperTileRenderer() {
		super(new ScooperBlockModel());
	}

	@Override
	public RenderType getRenderType(ScooperTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
