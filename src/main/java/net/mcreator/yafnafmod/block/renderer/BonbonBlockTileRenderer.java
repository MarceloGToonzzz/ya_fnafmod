package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BonbonBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BonbonBlockTileEntity;

public class BonbonBlockTileRenderer extends GeoBlockRenderer<BonbonBlockTileEntity> {
	public BonbonBlockTileRenderer() {
		super(new BonbonBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BonbonBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
