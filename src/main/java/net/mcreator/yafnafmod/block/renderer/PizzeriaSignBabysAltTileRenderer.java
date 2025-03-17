package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignBabysAltBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignBabysAltTileEntity;

public class PizzeriaSignBabysAltTileRenderer extends GeoBlockRenderer<PizzeriaSignBabysAltTileEntity> {
	public PizzeriaSignBabysAltTileRenderer() {
		super(new PizzeriaSignBabysAltBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignBabysAltTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
