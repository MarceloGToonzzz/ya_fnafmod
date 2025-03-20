package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarPoliceCruiserChevroletImpala1983BlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarPoliceCruiserChevroletImpala1983BlockTileEntity;

public class CarPoliceCruiserChevroletImpala1983BlockTileRenderer extends GeoBlockRenderer<CarPoliceCruiserChevroletImpala1983BlockTileEntity> {
	public CarPoliceCruiserChevroletImpala1983BlockTileRenderer() {
		super(new CarPoliceCruiserChevroletImpala1983BlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarPoliceCruiserChevroletImpala1983BlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
