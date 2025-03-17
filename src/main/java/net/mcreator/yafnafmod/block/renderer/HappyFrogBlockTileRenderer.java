package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.HappyFrogBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.HappyFrogBlockTileEntity;

public class HappyFrogBlockTileRenderer extends GeoBlockRenderer<HappyFrogBlockTileEntity> {
	public HappyFrogBlockTileRenderer() {
		super(new HappyFrogBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(HappyFrogBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
