package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignStansBudgetTechBlockModel;
import net.mcreator.yafnafmod.block.entity.ShopSignStansBudgetTechTileEntity;

public class ShopSignStansBudgetTechTileRenderer extends GeoBlockRenderer<ShopSignStansBudgetTechTileEntity> {
	public ShopSignStansBudgetTechTileRenderer() {
		super(new ShopSignStansBudgetTechBlockModel());
	}

	@Override
	public RenderType getRenderType(ShopSignStansBudgetTechTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
