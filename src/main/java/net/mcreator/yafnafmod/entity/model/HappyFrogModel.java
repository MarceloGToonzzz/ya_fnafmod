package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.HappyFrogEntity;

public class HappyFrogModel extends GeoModel<HappyFrogEntity> {
	@Override
	public ResourceLocation getAnimationResource(HappyFrogEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/happy_frog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappyFrogEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/happy_frog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappyFrogEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(HappyFrogEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("body");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
