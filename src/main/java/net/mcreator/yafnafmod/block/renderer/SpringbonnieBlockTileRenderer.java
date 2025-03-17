package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringbonnieBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.SpringbonnieBlockTileEntity;

public class SpringbonnieBlockTileRenderer extends GeoBlockRenderer<SpringbonnieBlockTileEntity> {
	public SpringbonnieBlockTileRenderer() {
		super(new SpringbonnieBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
