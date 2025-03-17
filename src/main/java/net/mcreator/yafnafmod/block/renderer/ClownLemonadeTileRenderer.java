package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClownLemonadeBlockModel;
import net.mcreator.yafnafmod.block.entity.ClownLemonadeTileEntity;

public class ClownLemonadeTileRenderer extends GeoBlockRenderer<ClownLemonadeTileEntity> {
	public ClownLemonadeTileRenderer() {
		super(new ClownLemonadeBlockModel());
	}

	@Override
	public RenderType getRenderType(ClownLemonadeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
