package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignSmilesAndServosBlockModel;
import net.mcreator.yafnafmod.block.entity.ShopSignSmilesAndServosTileEntity;

public class ShopSignSmilesAndServosTileRenderer extends GeoBlockRenderer<ShopSignSmilesAndServosTileEntity> {
	public ShopSignSmilesAndServosTileRenderer() {
		super(new ShopSignSmilesAndServosBlockModel());
	}

	@Override
	public RenderType getRenderType(ShopSignSmilesAndServosTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
