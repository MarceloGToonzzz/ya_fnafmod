package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredBonnieBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredBonnieBlockTileEntity;

public class WitheredBonnieBlockTileRenderer extends GeoBlockRenderer<WitheredBonnieBlockTileEntity> {
	public WitheredBonnieBlockTileRenderer() {
		super(new WitheredBonnieBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredBonnieBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
