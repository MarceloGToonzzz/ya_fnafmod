package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OldManConsequencesBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.OldManConsequencesBlockDisplayItem;

public class OldManConsequencesBlockDisplayItemRenderer extends GeoItemRenderer<OldManConsequencesBlockDisplayItem> {
	public OldManConsequencesBlockDisplayItemRenderer() {
		super(new OldManConsequencesBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(OldManConsequencesBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
