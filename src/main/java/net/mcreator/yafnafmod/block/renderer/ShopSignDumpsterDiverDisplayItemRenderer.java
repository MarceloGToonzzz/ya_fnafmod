package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ShopSignDumpsterDiverDisplayModel;
import net.mcreator.yafnafmod.block.display.ShopSignDumpsterDiverDisplayItem;

public class ShopSignDumpsterDiverDisplayItemRenderer extends GeoItemRenderer<ShopSignDumpsterDiverDisplayItem> {
	public ShopSignDumpsterDiverDisplayItemRenderer() {
		super(new ShopSignDumpsterDiverDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShopSignDumpsterDiverDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
