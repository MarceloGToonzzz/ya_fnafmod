package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeddbearBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.NeddbearBlockTileEntity;

public class NeddbearBlockTileRenderer extends GeoBlockRenderer<NeddbearBlockTileEntity> {
	public NeddbearBlockTileRenderer() {
		super(new NeddbearBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(NeddbearBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
