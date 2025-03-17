package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.FredbearBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.FredbearBlockTileEntity;

public class FredbearBlockTileRenderer extends GeoBlockRenderer<FredbearBlockTileEntity> {
	public FredbearBlockTileRenderer() {
		super(new FredbearBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(FredbearBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
