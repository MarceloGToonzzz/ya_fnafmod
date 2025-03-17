package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeFruityMazeBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeFruityMazeTileEntity;

public class ArcadeFruityMazeTileRenderer extends GeoBlockRenderer<ArcadeFruityMazeTileEntity> {
	public ArcadeFruityMazeTileRenderer() {
		super(new ArcadeFruityMazeBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeFruityMazeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
