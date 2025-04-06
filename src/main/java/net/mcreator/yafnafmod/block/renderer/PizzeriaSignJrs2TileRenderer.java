package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignJrs2BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignJrs2TileEntity;

public class PizzeriaSignJrs2TileRenderer extends GeoBlockRenderer<PizzeriaSignJrs2TileEntity> {
	public PizzeriaSignJrs2TileRenderer() {
		super(new PizzeriaSignJrs2BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignJrs2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
