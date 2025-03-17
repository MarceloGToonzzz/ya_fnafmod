package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFredbearIcecreamDisplayModel;
import net.mcreator.yafnafmod.block.display.CutoutFredbearIcecreamDisplayItem;

public class CutoutFredbearIcecreamDisplayItemRenderer extends GeoItemRenderer<CutoutFredbearIcecreamDisplayItem> {
	public CutoutFredbearIcecreamDisplayItemRenderer() {
		super(new CutoutFredbearIcecreamDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutFredbearIcecreamDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
