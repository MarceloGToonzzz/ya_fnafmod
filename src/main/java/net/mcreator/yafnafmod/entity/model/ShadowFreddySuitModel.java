package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.ShadowFreddySuitEntity;

public class ShadowFreddySuitModel extends GeoModel<ShadowFreddySuitEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShadowFreddySuitEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/fredbear_suit.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShadowFreddySuitEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/fredbear_suit.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShadowFreddySuitEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ShadowFreddySuitEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
