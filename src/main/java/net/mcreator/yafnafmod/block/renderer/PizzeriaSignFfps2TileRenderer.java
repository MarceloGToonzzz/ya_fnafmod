package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignFfps2BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignFfps2TileEntity;

public class PizzeriaSignFfps2TileRenderer extends GeoBlockRenderer<PizzeriaSignFfps2TileEntity> {
	public PizzeriaSignFfps2TileRenderer() {
		super(new PizzeriaSignFfps2BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignFfps2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
