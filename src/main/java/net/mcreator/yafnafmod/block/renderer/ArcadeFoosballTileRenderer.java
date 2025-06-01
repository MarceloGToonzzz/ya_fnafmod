package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeFoosballBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeFoosballTileEntity;

public class ArcadeFoosballTileRenderer extends GeoBlockRenderer<ArcadeFoosballTileEntity> {
	public ArcadeFoosballTileRenderer() {
		super(new ArcadeFoosballBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeFoosballTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
