package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignDumpsterDiverBlockModel;
import net.mcreator.yafnafmod.block.entity.ShopSignDumpsterDiverTileEntity;

public class ShopSignDumpsterDiverTileRenderer extends GeoBlockRenderer<ShopSignDumpsterDiverTileEntity> {
	public ShopSignDumpsterDiverTileRenderer() {
		super(new ShopSignDumpsterDiverBlockModel());
	}

	@Override
	public RenderType getRenderType(ShopSignDumpsterDiverTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
