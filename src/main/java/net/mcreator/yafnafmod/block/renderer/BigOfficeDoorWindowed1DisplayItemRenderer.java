package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigOfficeDoorWindowed1DisplayModel;
import net.mcreator.yafnafmod.block.display.BigOfficeDoorWindowed1DisplayItem;

public class BigOfficeDoorWindowed1DisplayItemRenderer extends GeoItemRenderer<BigOfficeDoorWindowed1DisplayItem> {
	public BigOfficeDoorWindowed1DisplayItemRenderer() {
		super(new BigOfficeDoorWindowed1DisplayModel());
	}

	@Override
	public RenderType getRenderType(BigOfficeDoorWindowed1DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
