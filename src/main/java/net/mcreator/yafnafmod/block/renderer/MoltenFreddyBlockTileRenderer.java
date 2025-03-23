package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MoltenFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.MoltenFreddyBlockTileEntity;

public class MoltenFreddyBlockTileRenderer extends GeoBlockRenderer<MoltenFreddyBlockTileEntity> {
	public MoltenFreddyBlockTileRenderer() {
		super(new MoltenFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(MoltenFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
