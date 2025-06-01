package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.ArcadeCandyCraneMachineBlockModel;
import net.mcreator.yafnafmod.block.entity.ArcadeCandyCraneMachineTileEntity;

public class ArcadeCandyCraneMachineTileRenderer extends GeoBlockRenderer<ArcadeCandyCraneMachineTileEntity> {
	public ArcadeCandyCraneMachineTileRenderer() {
		super(new ArcadeCandyCraneMachineBlockModel());
	}

	@Override
	public RenderType getRenderType(ArcadeCandyCraneMachineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
