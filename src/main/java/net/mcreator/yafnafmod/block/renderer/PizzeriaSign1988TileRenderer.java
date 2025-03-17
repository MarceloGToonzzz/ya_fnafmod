package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSign1988BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSign1988TileEntity;

public class PizzeriaSign1988TileRenderer extends GeoBlockRenderer<PizzeriaSign1988TileEntity> {
	public PizzeriaSign1988TileRenderer() {
		super(new PizzeriaSign1988BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSign1988TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
