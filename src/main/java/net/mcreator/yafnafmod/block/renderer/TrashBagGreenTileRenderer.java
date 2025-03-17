package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.TrashBagGreenBlockModel;
import net.mcreator.yafnafmod.block.entity.TrashBagGreenTileEntity;

public class TrashBagGreenTileRenderer extends GeoBlockRenderer<TrashBagGreenTileEntity> {
	public TrashBagGreenTileRenderer() {
		super(new TrashBagGreenBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashBagGreenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
