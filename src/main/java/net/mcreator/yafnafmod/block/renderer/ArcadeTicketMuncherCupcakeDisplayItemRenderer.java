package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeTicketMuncherCupcakeDisplayModel;
import net.mcreator.yafnafmod.block.display.ArcadeTicketMuncherCupcakeDisplayItem;

public class ArcadeTicketMuncherCupcakeDisplayItemRenderer extends GeoItemRenderer<ArcadeTicketMuncherCupcakeDisplayItem> {
	public ArcadeTicketMuncherCupcakeDisplayItemRenderer() {
		super(new ArcadeTicketMuncherCupcakeDisplayModel());
	}

	@Override
	public RenderType getRenderType(ArcadeTicketMuncherCupcakeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
