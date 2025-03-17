package net.mcreator.yafnafmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yafnafmod.entity.MoltenFreddyEntity;

public class MoltenFreddyModel extends GeoModel<MoltenFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(MoltenFreddyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "animations/molten_freddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MoltenFreddyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "geo/molten_freddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MoltenFreddyEntity entity) {
		return new ResourceLocation("ya_fnafmod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MoltenFreddyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
