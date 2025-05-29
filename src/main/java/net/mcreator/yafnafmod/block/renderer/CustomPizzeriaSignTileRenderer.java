package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.CustomPizzeriaSignBlockModel;
import net.mcreator.yafnafmod.block.entity.CustomPizzeriaSignTileEntity;

public class CustomPizzeriaSignTileRenderer extends GeoBlockRenderer<CustomPizzeriaSignTileEntity> {
	public CustomPizzeriaSignTileRenderer() {
		super(new CustomPizzeriaSignBlockModel());
	}

	@Override
	public RenderType getRenderType(CustomPizzeriaSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
