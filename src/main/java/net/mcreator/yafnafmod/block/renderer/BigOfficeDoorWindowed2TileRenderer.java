package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BigOfficeDoorWindowed2BlockModel;
import net.mcreator.yafnafmod.block.entity.BigOfficeDoorWindowed2TileEntity;

public class BigOfficeDoorWindowed2TileRenderer extends GeoBlockRenderer<BigOfficeDoorWindowed2TileEntity> {
	public BigOfficeDoorWindowed2TileRenderer() {
		super(new BigOfficeDoorWindowed2BlockModel());
	}

	@Override
	public RenderType getRenderType(BigOfficeDoorWindowed2TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
