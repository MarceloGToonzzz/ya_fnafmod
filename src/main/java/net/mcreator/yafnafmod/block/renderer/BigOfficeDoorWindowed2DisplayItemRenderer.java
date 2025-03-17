package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigOfficeDoorWindowed2DisplayModel;
import net.mcreator.yafnafmod.block.display.BigOfficeDoorWindowed2DisplayItem;

public class BigOfficeDoorWindowed2DisplayItemRenderer extends GeoItemRenderer<BigOfficeDoorWindowed2DisplayItem> {
	public BigOfficeDoorWindowed2DisplayItemRenderer() {
		super(new BigOfficeDoorWindowed2DisplayModel());
	}

	@Override
	public RenderType getRenderType(BigOfficeDoorWindowed2DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
