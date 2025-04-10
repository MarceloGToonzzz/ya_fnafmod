package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.EggBabyBlockModel;
import net.mcreator.yafnafmod.block.entity.EggBabyTileEntity;

public class EggBabyTileRenderer extends GeoBlockRenderer<EggBabyTileEntity> {
	public EggBabyTileRenderer() {
		super(new EggBabyBlockModel());
	}

	@Override
	public RenderType getRenderType(EggBabyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
