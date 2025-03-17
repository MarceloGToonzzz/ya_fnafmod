package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ToyChicaChickenBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.ToyChicaChickenBlockTileEntity;

public class ToyChicaChickenBlockTileRenderer extends GeoBlockRenderer<ToyChicaChickenBlockTileEntity> {
	public ToyChicaChickenBlockTileRenderer() {
		super(new ToyChicaChickenBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(ToyChicaChickenBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
