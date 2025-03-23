package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.MrHugsBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.MrHugsBlockTileEntity;

public class MrHugsBlockTileRenderer extends GeoBlockRenderer<MrHugsBlockTileEntity> {
	public MrHugsBlockTileRenderer() {
		super(new MrHugsBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(MrHugsBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
