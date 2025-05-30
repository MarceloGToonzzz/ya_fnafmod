package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BrokenBonnieBlockModel;
import net.mcreator.yafnafmod.block.entity.BrokenBonnieTileEntity;

public class BrokenBonnieTileRenderer extends GeoBlockRenderer<BrokenBonnieTileEntity> {
	public BrokenBonnieTileRenderer() {
		super(new BrokenBonnieBlockModel());
	}

	@Override
	public RenderType getRenderType(BrokenBonnieTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
