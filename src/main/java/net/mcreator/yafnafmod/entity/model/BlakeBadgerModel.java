package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.BlakeBadgerEntity;

public class BlakeBadgerModel extends GeoModel<BlakeBadgerEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlakeBadgerEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/blakebadger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlakeBadgerEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/blakebadger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlakeBadgerEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BlakeBadgerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
