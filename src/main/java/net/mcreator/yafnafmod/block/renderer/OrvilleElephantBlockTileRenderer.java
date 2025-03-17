package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OrvilleElephantBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.OrvilleElephantBlockTileEntity;

public class OrvilleElephantBlockTileRenderer extends GeoBlockRenderer<OrvilleElephantBlockTileEntity> {
	public OrvilleElephantBlockTileRenderer() {
		super(new OrvilleElephantBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(OrvilleElephantBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
