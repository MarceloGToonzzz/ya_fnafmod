package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigOfficeDoorWindowed1BlockModel;
import net.mcreator.yafnafmod.block.entity.BigOfficeDoorWindowed1TileEntity;

public class BigOfficeDoorWindowed1TileRenderer extends GeoBlockRenderer<BigOfficeDoorWindowed1TileEntity> {
	public BigOfficeDoorWindowed1TileRenderer() {
		super(new BigOfficeDoorWindowed1BlockModel());
	}

	@Override
	public RenderType getRenderType(BigOfficeDoorWindowed1TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
