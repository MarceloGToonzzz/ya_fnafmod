package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignArcadeBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonSignArcadeTileEntity;

public class NeonSignArcadeTileRenderer extends GeoBlockRenderer<NeonSignArcadeTileEntity> {
	public NeonSignArcadeTileRenderer() {
		super(new NeonSignArcadeBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonSignArcadeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
