package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeLilHoopsDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeLilHoopsDisplayItem;

public class ArcadeLilHoopsDisplayItemRenderer extends GeoItemRenderer<ArcadeLilHoopsDisplayItem> {
	public ArcadeLilHoopsDisplayItemRenderer() {
		super(new ArcadeLilHoopsDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeLilHoopsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
