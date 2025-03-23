package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DrTeethBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DrTeethBlockTileEntity;

public class DrTeethBlockTileRenderer extends GeoBlockRenderer<DrTeethBlockTileEntity> {
	public DrTeethBlockTileRenderer() {
		super(new DrTeethBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DrTeethBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
