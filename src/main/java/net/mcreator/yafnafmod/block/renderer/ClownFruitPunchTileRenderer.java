package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClownFruitPunchBlockModel;
import net.mcreator.yafnafmod.block.entity.ClownFruitPunchTileEntity;

public class ClownFruitPunchTileRenderer extends GeoBlockRenderer<ClownFruitPunchTileEntity> {
	public ClownFruitPunchTileRenderer() {
		super(new ClownFruitPunchBlockModel());
	}

	@Override
	public RenderType getRenderType(ClownFruitPunchTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
