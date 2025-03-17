package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.OrvilleElephantBlockDisplayModel;
import net.mcreator.yafnafmod.block.display.OrvilleElephantBlockDisplayItem;

public class OrvilleElephantBlockDisplayItemRenderer extends GeoItemRenderer<OrvilleElephantBlockDisplayItem> {
	public OrvilleElephantBlockDisplayItemRenderer() {
		super(new OrvilleElephantBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(OrvilleElephantBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
