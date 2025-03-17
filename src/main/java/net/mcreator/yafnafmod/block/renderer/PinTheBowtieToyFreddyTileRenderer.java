package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.PinTheBowtieToyFreddyBlockModel;
import net.mcreator.yafnafmod.block.entity.PinTheBowtieToyFreddyTileEntity;

public class PinTheBowtieToyFreddyTileRenderer extends GeoBlockRenderer<PinTheBowtieToyFreddyTileEntity> {
	public PinTheBowtieToyFreddyTileRenderer() {
		super(new PinTheBowtieToyFreddyBlockModel());
	}

	@Override
	public RenderType getRenderType(PinTheBowtieToyFreddyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
