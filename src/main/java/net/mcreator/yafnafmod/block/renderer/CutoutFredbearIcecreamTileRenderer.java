package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CutoutFredbearIcecreamBlockModel;
import net.mcreator.yafnafmod.block.entity.CutoutFredbearIcecreamTileEntity;

public class CutoutFredbearIcecreamTileRenderer extends GeoBlockRenderer<CutoutFredbearIcecreamTileEntity> {
	public CutoutFredbearIcecreamTileRenderer() {
		super(new CutoutFredbearIcecreamBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutFredbearIcecreamTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
