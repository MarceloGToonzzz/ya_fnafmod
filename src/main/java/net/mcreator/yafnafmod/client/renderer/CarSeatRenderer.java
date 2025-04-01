
package net.mcreator.yafnafmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.yafnafmod.entity.CarSeatEntity;
import net.mcreator.yafnafmod.client.model.Modela;

public class CarSeatRenderer extends MobRenderer<CarSeatEntity, Modela<CarSeatEntity>> {
	public CarSeatRenderer(EntityRendererProvider.Context context) {
		super(context, new Modela<CarSeatEntity>(context.bakeLayer(Modela.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CarSeatEntity entity) {
		return new ResourceLocation("ya_fnafmod:textures/entities/seat.png");
	}
}
