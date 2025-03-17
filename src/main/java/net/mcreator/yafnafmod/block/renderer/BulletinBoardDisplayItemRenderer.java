package net.mcreator.yafnafmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.yafnafmod.block.model.BulletinBoardDisplayModel;
import net.mcreator.yafnafmod.block.display.BulletinBoardDisplayItem;

public class BulletinBoardDisplayItemRenderer extends GeoItemRenderer<BulletinBoardDisplayItem> {
	public BulletinBoardDisplayItemRenderer() {
		super(new BulletinBoardDisplayModel());
	}

	@Override
	public RenderType getRenderType(BulletinBoardDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
