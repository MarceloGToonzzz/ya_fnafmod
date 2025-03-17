package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonSignPartyRoomBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonSignPartyRoomTileEntity;

public class NeonSignPartyRoomTileRenderer extends GeoBlockRenderer<NeonSignPartyRoomTileEntity> {
	public NeonSignPartyRoomTileRenderer() {
		super(new NeonSignPartyRoomBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonSignPartyRoomTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
