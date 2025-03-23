package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BalloonBoyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.BalloonBoyBlockTileEntity;

public class BalloonBoyBlockTileRenderer extends GeoBlockRenderer<BalloonBoyBlockTileEntity> {
	public BalloonBoyBlockTileRenderer() {
		super(new BalloonBoyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BalloonBoyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
