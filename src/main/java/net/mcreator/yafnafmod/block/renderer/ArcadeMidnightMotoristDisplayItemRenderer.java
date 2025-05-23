package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeMidnightMotoristDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeMidnightMotoristDisplayItem;

public class ArcadeMidnightMotoristDisplayItemRenderer extends GeoItemRenderer<ArcadeMidnightMotoristDisplayItem> {
	public ArcadeMidnightMotoristDisplayItemRenderer() {
		super(new ArcadeMidnightMotoristDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeMidnightMotoristDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
