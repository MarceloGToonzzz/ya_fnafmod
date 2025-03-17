package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CarDodgeRam1982BlockBlockModel;
import net.mcreator.yafnafmod.block.entity.CarDodgeRam1982BlockTileEntity;

public class CarDodgeRam1982BlockTileRenderer extends GeoBlockRenderer<CarDodgeRam1982BlockTileEntity> {
	public CarDodgeRam1982BlockTileRenderer() {
		super(new CarDodgeRam1982BlockBlockModel());
	}

	@Override
	public RenderType getRenderType(CarDodgeRam1982BlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
