package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.WitheredBonbonBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.WitheredBonbonBlockTileEntity;

public class WitheredBonbonBlockTileRenderer extends GeoBlockRenderer<WitheredBonbonBlockTileEntity> {
	public WitheredBonbonBlockTileRenderer() {
		super(new WitheredBonbonBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(WitheredBonbonBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
