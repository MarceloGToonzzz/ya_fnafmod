package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BathroomStallBlockModel;
import net.mcreator.yafnafmod.block.entity.BathroomStallTileEntity;

public class BathroomStallTileRenderer extends GeoBlockRenderer<BathroomStallTileEntity> {
	public BathroomStallTileRenderer() {
		super(new BathroomStallBlockModel());
	}

	@Override
	public RenderType getRenderType(BathroomStallTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
