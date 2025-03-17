package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringbonnieHeadBlockModel;
import net.mcreator.yafnafmod.block.entity.SpringbonnieHeadTileEntity;

public class SpringbonnieHeadTileRenderer extends GeoBlockRenderer<SpringbonnieHeadTileEntity> {
	public SpringbonnieHeadTileRenderer() {
		super(new SpringbonnieHeadBlockModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieHeadTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
