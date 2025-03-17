package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonJukeboxDisplayModel;
import net.mcreator.yafnafmod.block.display.NeonJukeboxDisplayItem;

public class NeonJukeboxDisplayItemRenderer extends GeoItemRenderer<NeonJukeboxDisplayItem> {
	public NeonJukeboxDisplayItemRenderer() {
		super(new NeonJukeboxDisplayModel());
	}

	@Override
	public RenderType getRenderType(NeonJukeboxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
