package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Lolbit409BlockBlockModel;
import net.mcreator.yafnafmod.block.entity.Lolbit409BlockTileEntity;

public class Lolbit409BlockTileRenderer extends GeoBlockRenderer<Lolbit409BlockTileEntity> {
	public Lolbit409BlockTileRenderer() {
		super(new Lolbit409BlockBlockModel());
	}

	@Override
	public RenderType getRenderType(Lolbit409BlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
