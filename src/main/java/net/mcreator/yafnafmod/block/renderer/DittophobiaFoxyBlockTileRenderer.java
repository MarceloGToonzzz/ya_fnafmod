package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaFoxyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DittophobiaFoxyBlockTileEntity;

public class DittophobiaFoxyBlockTileRenderer extends GeoBlockRenderer<DittophobiaFoxyBlockTileEntity> {
	public DittophobiaFoxyBlockTileRenderer() {
		super(new DittophobiaFoxyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaFoxyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
