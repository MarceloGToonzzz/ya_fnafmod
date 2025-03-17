package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ClawMachineCupcakeBonanzaBlockModel;
import net.mcreator.yafnafmod.block.entity.ClawMachineCupcakeBonanzaTileEntity;

public class ClawMachineCupcakeBonanzaTileRenderer extends GeoBlockRenderer<ClawMachineCupcakeBonanzaTileEntity> {
	public ClawMachineCupcakeBonanzaTileRenderer() {
		super(new ClawMachineCupcakeBonanzaBlockModel());
	}

	@Override
	public RenderType getRenderType(ClawMachineCupcakeBonanzaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
