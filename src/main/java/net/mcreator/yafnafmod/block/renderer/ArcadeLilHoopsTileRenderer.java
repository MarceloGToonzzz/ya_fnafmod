package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeLilHoopsBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeLilHoopsTileEntity;

public class ArcadeLilHoopsTileRenderer extends GeoBlockRenderer<ArcadeLilHoopsTileEntity> {
	public ArcadeLilHoopsTileRenderer() {
		super(new ArcadeLilHoopsBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeLilHoopsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
