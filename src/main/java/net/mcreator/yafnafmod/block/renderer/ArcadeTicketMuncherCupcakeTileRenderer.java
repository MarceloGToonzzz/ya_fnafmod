package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeTicketMuncherCupcakeBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeTicketMuncherCupcakeTileEntity;

public class ArcadeTicketMuncherCupcakeTileRenderer extends GeoBlockRenderer<ArcadeTicketMuncherCupcakeTileEntity> {
	public ArcadeTicketMuncherCupcakeTileRenderer() {
		super(new ArcadeTicketMuncherCupcakeBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeTicketMuncherCupcakeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
