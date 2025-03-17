package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeFruityMazeDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeFruityMazeDisplayItem;

public class ArcadeFruityMazeDisplayItemRenderer extends GeoItemRenderer<ArcadeFruityMazeDisplayItem> {
	public ArcadeFruityMazeDisplayItemRenderer() {
		super(new ArcadeFruityMazeDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeFruityMazeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
