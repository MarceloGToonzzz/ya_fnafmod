package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.entity.RatEntity;

public class RatOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("chuck")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 3);
		} else if ((entity.getDisplayName().getString()).equals("burger")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 4);
		} else if ((entity.getDisplayName().getString()).equals("rizz")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 5);
		} else if ((entity.getDisplayName().getString()).equals("stupid")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 6);
		} else if ((entity.getDisplayName().getString()).equals("rapper")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 7);
		} else if ((entity.getDisplayName().getString()).equals("midas")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 8);
		} else if ((entity.getDisplayName().getString()).equals("pipe")) {
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, 9);
		}
		if ((entity instanceof RatEntity _datEntL14 && _datEntL14.getEntityData().get(RatEntity.DATA_setSkin)) == false) {
			if (entity instanceof RatEntity _datEntSetL)
				_datEntSetL.getEntityData().set(RatEntity.DATA_setSkin, true);
			if (entity instanceof RatEntity _datEntSetI)
				_datEntSetI.getEntityData().set(RatEntity.DATA_skin, Mth.nextInt(RandomSource.create(), 0, 2));
		}
		if ((entity instanceof RatEntity _datEntI ? _datEntI.getEntityData().get(RatEntity.DATA_skin) : 0) == 0) {
			if (entity instanceof RatEntity animatable)
				animatable.setTexture("rat");
		} else {
			if (entity instanceof RatEntity animatable)
				animatable.setTexture(("rat" + "-" + (entity instanceof RatEntity _datEntI ? _datEntI.getEntityData().get(RatEntity.DATA_skin) : 0)));
		}
	}
}
