package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashBagBlackBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashBagBlackTileEntity;

public class TrashBagBlackTileRenderer extends GeoBlockRenderer<TrashBagBlackTileEntity> {
	public TrashBagBlackTileRenderer() {
		super(new TrashBagBlackBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashBagBlackTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
