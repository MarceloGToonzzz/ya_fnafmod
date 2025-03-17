package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.GrandfatherClockBlockModel;
import net.mcreator.yafnafmod.block.entity.GrandfatherClockTileEntity;

public class GrandfatherClockTileRenderer extends GeoBlockRenderer<GrandfatherClockTileEntity> {
	public GrandfatherClockTileRenderer() {
		super(new GrandfatherClockBlockModel());
	}

	@Override
	public RenderType getRenderType(GrandfatherClockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
