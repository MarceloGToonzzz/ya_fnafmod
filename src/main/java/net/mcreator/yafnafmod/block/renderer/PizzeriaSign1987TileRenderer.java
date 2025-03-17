package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSign1987BlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSign1987TileEntity;

public class PizzeriaSign1987TileRenderer extends GeoBlockRenderer<PizzeriaSign1987TileEntity> {
	public PizzeriaSign1987TileRenderer() {
		super(new PizzeriaSign1987BlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSign1987TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
