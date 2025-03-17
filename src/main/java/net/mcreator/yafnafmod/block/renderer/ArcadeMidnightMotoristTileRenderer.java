package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeMidnightMotoristBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeMidnightMotoristTileEntity;

public class ArcadeMidnightMotoristTileRenderer extends GeoBlockRenderer<ArcadeMidnightMotoristTileEntity> {
	public ArcadeMidnightMotoristTileRenderer() {
		super(new ArcadeMidnightMotoristBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeMidnightMotoristTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
