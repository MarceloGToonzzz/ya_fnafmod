package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShreddyFazchairBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ShreddyFazchairBlockTileEntity;

public class ShreddyFazchairBlockTileRenderer extends GeoBlockRenderer<ShreddyFazchairBlockTileEntity> {
	public ShreddyFazchairBlockTileRenderer() {
		super(new ShreddyFazchairBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ShreddyFazchairBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
