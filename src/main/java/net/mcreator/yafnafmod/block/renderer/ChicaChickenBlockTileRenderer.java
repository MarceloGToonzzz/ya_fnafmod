package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ChicaChickenBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ChicaChickenBlockTileEntity;

public class ChicaChickenBlockTileRenderer extends GeoBlockRenderer<ChicaChickenBlockTileEntity> {
	public ChicaChickenBlockTileRenderer() {
		super(new ChicaChickenBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ChicaChickenBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
