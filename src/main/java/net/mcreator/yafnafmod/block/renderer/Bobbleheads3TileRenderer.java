package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.Bobbleheads3BlockModel;
import net.mcreator.yafnafmod.block.entity.Bobbleheads3TileEntity;

public class Bobbleheads3TileRenderer extends GeoBlockRenderer<Bobbleheads3TileEntity> {
	public Bobbleheads3TileRenderer() {
		super(new Bobbleheads3BlockModel());
	}

	@Override
	public RenderType getRenderType(Bobbleheads3TileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
