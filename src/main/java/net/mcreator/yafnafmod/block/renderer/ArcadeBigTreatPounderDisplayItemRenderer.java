package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeBigTreatPounderDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeBigTreatPounderDisplayItem;

public class ArcadeBigTreatPounderDisplayItemRenderer extends GeoItemRenderer<ArcadeBigTreatPounderDisplayItem> {
	public ArcadeBigTreatPounderDisplayItemRenderer() {
		super(new ArcadeBigTreatPounderDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeBigTreatPounderDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
