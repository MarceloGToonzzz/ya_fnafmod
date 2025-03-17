package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.SpringbonnieBlock01BlockModel;
import net.mcreator.yafnafmod.block.entity.SpringbonnieBlock01TileEntity;

public class SpringbonnieBlock01TileRenderer extends GeoBlockRenderer<SpringbonnieBlock01TileEntity> {
	public SpringbonnieBlock01TileRenderer() {
		super(new SpringbonnieBlock01BlockModel());
	}

	@Override
	public RenderType getRenderType(SpringbonnieBlock01TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
