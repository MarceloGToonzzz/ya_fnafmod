package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MedicalStationBlockModel;
import net.mcreator.yafnafmod.block.entity.MedicalStationTileEntity;

public class MedicalStationTileRenderer extends GeoBlockRenderer<MedicalStationTileEntity> {
	public MedicalStationTileRenderer() {
		super(new MedicalStationBlockModel());
	}

	@Override
	public RenderType getRenderType(MedicalStationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
