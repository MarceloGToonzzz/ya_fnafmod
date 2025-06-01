package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeBigTreatPounderBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeBigTreatPounderTileEntity;

public class ArcadeBigTreatPounderTileRenderer extends GeoBlockRenderer<ArcadeBigTreatPounderTileEntity> {
	public ArcadeBigTreatPounderTileRenderer() {
		super(new ArcadeBigTreatPounderBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeBigTreatPounderTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
