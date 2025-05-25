package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Endo02PileBlockModel;
import net.mcreator.yafnafmod.block.entity.Endo02PileTileEntity;

public class Endo02PileTileRenderer extends GeoBlockRenderer<Endo02PileTileEntity> {
	public Endo02PileTileRenderer() {
		super(new Endo02PileBlockModel());
	}

	@Override
	public RenderType getRenderType(Endo02PileTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
