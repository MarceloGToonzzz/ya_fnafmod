package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.DittophobiaBonnieBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.DittophobiaBonnieBlockTileEntity;

public class DittophobiaBonnieBlockTileRenderer extends GeoBlockRenderer<DittophobiaBonnieBlockTileEntity> {
	public DittophobiaBonnieBlockTileRenderer() {
		super(new DittophobiaBonnieBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(DittophobiaBonnieBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
