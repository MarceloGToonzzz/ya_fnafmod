package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.RockstarFreddyBlockBlockModel;
import net.mcreator.yafnafmod.block.entity.RockstarFreddyBlockTileEntity;

public class RockstarFreddyBlockTileRenderer extends GeoBlockRenderer<RockstarFreddyBlockTileEntity> {
	public RockstarFreddyBlockTileRenderer() {
		super(new RockstarFreddyBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(RockstarFreddyBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
