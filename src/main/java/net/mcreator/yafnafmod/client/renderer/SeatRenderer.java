
package net.mcreator.yafnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.yafnafmod.entity.SeatEntity;
import net.mcreator.yafnafmod.client.model.Modela;

public class SeatRenderer extends MobRenderer<SeatEntity, Modela<SeatEntity>> {
	public SeatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modela(context.bakeLayer(Modela.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SeatEntity entity) {
		return new ResourceLocation("ya_fnafmod:textures/entities/seat.png");
	}
}
