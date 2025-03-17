package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FreddyStandBlockModel;
import net.mcreator.yafnafmod.block.entity.FreddyStandTileEntity;

public class FreddyStandTileRenderer extends GeoBlockRenderer<FreddyStandTileEntity> {
	public FreddyStandTileRenderer() {
		super(new FreddyStandBlockModel());
	}

	@Override
	public RenderType getRenderType(FreddyStandTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
