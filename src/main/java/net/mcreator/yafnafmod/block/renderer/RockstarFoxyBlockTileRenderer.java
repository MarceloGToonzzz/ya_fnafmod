package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarFoxyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RockstarFoxyBlockTileEntity;

public class RockstarFoxyBlockTileRenderer extends GeoBlockRenderer<RockstarFoxyBlockTileEntity> {
	public RockstarFoxyBlockTileRenderer() {
		super(new RockstarFoxyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RockstarFoxyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
