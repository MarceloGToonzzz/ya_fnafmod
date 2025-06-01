package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeCandyCraneMachineDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeCandyCraneMachineDisplayItem;

public class ArcadeCandyCraneMachineDisplayItemRenderer extends GeoItemRenderer<ArcadeCandyCraneMachineDisplayItem> {
	public ArcadeCandyCraneMachineDisplayItemRenderer() {
		super(new ArcadeCandyCraneMachineDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeCandyCraneMachineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
