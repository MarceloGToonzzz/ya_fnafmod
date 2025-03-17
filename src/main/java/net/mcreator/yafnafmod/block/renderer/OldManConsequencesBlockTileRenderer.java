package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OldManConsequencesBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.OldManConsequencesBlockTileEntity;

public class OldManConsequencesBlockTileRenderer extends GeoBlockRenderer<OldManConsequencesBlockTileEntity> {
	public OldManConsequencesBlockTileRenderer() {
		super(new OldManConsequencesBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(OldManConsequencesBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
