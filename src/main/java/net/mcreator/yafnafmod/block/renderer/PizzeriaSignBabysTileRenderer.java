package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PizzeriaSignBabysBlockModel;
import net.mcreator.yafnafmod.block.entity.PizzeriaSignBabysTileEntity;

public class PizzeriaSignBabysTileRenderer extends GeoBlockRenderer<PizzeriaSignBabysTileEntity> {
	public PizzeriaSignBabysTileRenderer() {
		super(new PizzeriaSignBabysBlockModel());
	}

	@Override
	public RenderType getRenderType(PizzeriaSignBabysTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
