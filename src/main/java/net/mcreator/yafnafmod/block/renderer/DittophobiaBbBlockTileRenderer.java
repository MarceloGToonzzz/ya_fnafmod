package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaBbBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DittophobiaBbBlockTileEntity;

public class DittophobiaBbBlockTileRenderer extends GeoBlockRenderer<DittophobiaBbBlockTileEntity> {
	public DittophobiaBbBlockTileRenderer() {
		super(new DittophobiaBbBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaBbBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
