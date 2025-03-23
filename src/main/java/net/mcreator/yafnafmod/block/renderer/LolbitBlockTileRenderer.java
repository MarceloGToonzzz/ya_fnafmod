package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.LolbitBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.LolbitBlockTileEntity;

public class LolbitBlockTileRenderer extends GeoBlockRenderer<LolbitBlockTileEntity> {
	public LolbitBlockTileRenderer() {
		super(new LolbitBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(LolbitBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
