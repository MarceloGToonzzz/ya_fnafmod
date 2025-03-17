package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BulletinBoardBlockModel;
import net.mcreator.yafnafmod.block.entity.BulletinBoardTileEntity;

public class BulletinBoardTileRenderer extends GeoBlockRenderer<BulletinBoardTileEntity> {
	public BulletinBoardTileRenderer() {
		super(new BulletinBoardBlockModel());
	}

	@Override
	public RenderType getRenderType(BulletinBoardTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
