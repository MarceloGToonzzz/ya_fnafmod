package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignKitchenBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonSignKitchenTileEntity;

public class NeonSignKitchenTileRenderer extends GeoBlockRenderer<NeonSignKitchenTileEntity> {
	public NeonSignKitchenTileRenderer() {
		super(new NeonSignKitchenBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonSignKitchenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
