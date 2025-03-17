package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.NeonJukeboxBlockModel;
import net.mcreator.yafnafmod.block.entity.NeonJukeboxTileEntity;

public class NeonJukeboxTileRenderer extends GeoBlockRenderer<NeonJukeboxTileEntity> {
	public NeonJukeboxTileRenderer() {
		super(new NeonJukeboxBlockModel());
	}

	@Override
	public RenderType getRenderType(NeonJukeboxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
