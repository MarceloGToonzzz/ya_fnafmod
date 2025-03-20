package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.entity.WitheredFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyEntity;
import net.mcreator.yafnafmod.entity.ToyFreddyDayEntity;
import net.mcreator.yafnafmod.entity.PuppetEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantEntity;
import net.mcreator.yafnafmod.entity.NightmarionneEntity;
import net.mcreator.yafnafmod.entity.NightmareFreddyEntity;
import net.mcreator.yafnafmod.entity.NightmareFredbearEntity;
import net.mcreator.yafnafmod.entity.NightmareEntity;
import net.mcreator.yafnafmod.entity.NeddbearEntity;
import net.mcreator.yafnafmod.entity.MrHippoEntity;
import net.mcreator.yafnafmod.entity.LeftyEntity;
import net.mcreator.yafnafmod.entity.FuntimeDelilahEntity;
import net.mcreator.yafnafmod.entity.FreddyFazbearEntity;
import net.mcreator.yafnafmod.entity.EnnardEntity;
import net.mcreator.yafnafmod.entity.CircusBabyEntity;

public class DuckingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean can_laugh = false;
		if (world.getBlockState(BlockPos.containing(x, y + 2, z)).canOcclude()) {
			if (entity.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D) {
				if (entity instanceof FreddyFazbearEntity) {
					((FreddyFazbearEntity) entity).setAnimation("animation.freddy.fred_walk_duck");
				}
				if (entity instanceof ToyFreddyEntity) {
					((ToyFreddyEntity) entity).setAnimation("animation.freddy.walk_night_duck");
				}
				if (entity instanceof ToyFreddyDayEntity) {
					((ToyFreddyDayEntity) entity).setAnimation("animation.freddy.walk_day_duck");
				}
				if (entity instanceof WitheredFreddyEntity) {
					((WitheredFreddyEntity) entity).setAnimation("animation.freddy.wfred_walk_duck");
				}
				if (entity instanceof PuppetEntity) {
					((PuppetEntity) entity).setAnimation("animation.puppet.walk_duck");
				}
				if (entity instanceof NightmareFreddyEntity) {
					((NightmareFreddyEntity) entity).setAnimation("animation.nfreddy.walk_duck");
				}
				if (entity instanceof NightmareFredbearEntity) {
					((NightmareFredbearEntity) entity).setAnimation("animation.fredbear.walk_duck");
				}
				if (entity instanceof NightmareEntity) {
					((NightmareEntity) entity).setAnimation("animation.fredbear.walk_duck");
				}
				if (entity instanceof NightmarionneEntity) {
					((NightmarionneEntity) entity).setAnimation("animation.puppet.walk_duck");
				}
				if (entity instanceof CircusBabyEntity) {
					((CircusBabyEntity) entity).setAnimation("animation.model.walk_duck");
				}
				if (entity instanceof EnnardEntity) {
					((EnnardEntity) entity).setAnimation("animation.model.walk_duck");
				}
				if (entity instanceof NeddbearEntity) {
					((NeddbearEntity) entity).setAnimation("animation.neddbear.walk_duck");
				}
				if (entity instanceof FuntimeDelilahEntity) {
					((FuntimeDelilahEntity) entity).setAnimation("animation.model.walk_duck");
				}
				if (entity instanceof MrHippoEntity) {
					((MrHippoEntity) entity).setAnimation("animation.hippo.walk_duck");
				}
				if (entity instanceof OrvilleElephantEntity) {
					((OrvilleElephantEntity) entity).setAnimation("animation.model.walk_duck");
				}
				if (entity instanceof LeftyEntity) {
					((LeftyEntity) entity).setAnimation("animation.lefty.walk_duck");
				}
			} else {
				if (entity instanceof FreddyFazbearEntity) {
					((FreddyFazbearEntity) entity).setAnimation("animation.freddy.fred_idle_duck");
				}
				if (entity instanceof ToyFreddyEntity) {
					((ToyFreddyEntity) entity).setAnimation("animation.freddy.idle_night_duck");
				}
				if (entity instanceof ToyFreddyDayEntity) {
					((ToyFreddyDayEntity) entity).setAnimation("animation.freddy.idle_day_duck");
				}
				if (entity instanceof WitheredFreddyEntity) {
					((WitheredFreddyEntity) entity).setAnimation("animation.freddy.wfred_idle_duck");
				}
				if (entity instanceof PuppetEntity) {
					((PuppetEntity) entity).setAnimation("animation.puppet.idle_duck");
				}
				if (entity instanceof NightmareFreddyEntity) {
					((NightmareFreddyEntity) entity).setAnimation("animation.nfreddy.idle_duck");
				}
				if (entity instanceof NightmareFredbearEntity) {
					((NightmareFredbearEntity) entity).setAnimation("animation.fredbear.idle_duck");
				}
				if (entity instanceof NightmareEntity) {
					((NightmareEntity) entity).setAnimation("animation.fredbear.idle_duck");
				}
				if (entity instanceof NightmarionneEntity) {
					((NightmarionneEntity) entity).setAnimation("animation.puppet.duck_idle");
				}
				if (entity instanceof CircusBabyEntity) {
					((CircusBabyEntity) entity).setAnimation("animation.model.idle_duck");
				}
				if (entity instanceof EnnardEntity) {
					((EnnardEntity) entity).setAnimation("animation.model.idle_duck");
				}
				if (entity instanceof NeddbearEntity) {
					((NeddbearEntity) entity).setAnimation("animation.neddbear.idle_duck");
				}
				if (entity instanceof FuntimeDelilahEntity) {
					((FuntimeDelilahEntity) entity).setAnimation("animation.model.idle_duck");
				}
				if (entity instanceof MrHippoEntity) {
					((MrHippoEntity) entity).setAnimation("animation.hippo.idle_duck");
				}
				if (entity instanceof OrvilleElephantEntity) {
					((OrvilleElephantEntity) entity).setAnimation("animation.model.idle_duck");
				}
				if (entity instanceof LeftyEntity) {
					((LeftyEntity) entity).setAnimation("animation.lefty.idle_duck");
				}
			}
		} else {
			if (entity instanceof FreddyFazbearEntity) {
				((FreddyFazbearEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ToyFreddyEntity) {
				((ToyFreddyEntity) entity).setAnimation("empty");
			}
			if (entity instanceof ToyFreddyDayEntity) {
				((ToyFreddyDayEntity) entity).setAnimation("empty");
			}
			if (entity instanceof WitheredFreddyEntity) {
				((WitheredFreddyEntity) entity).setAnimation("empty");
			}
			if (entity instanceof PuppetEntity) {
				((PuppetEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NightmareFreddyEntity) {
				((NightmareFreddyEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NightmareFredbearEntity) {
				((NightmareFredbearEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NightmareEntity) {
				((NightmareEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NightmarionneEntity) {
				((NightmarionneEntity) entity).setAnimation("empty");
			}
			if (entity instanceof CircusBabyEntity) {
				((CircusBabyEntity) entity).setAnimation("empty");
			}
			if (entity instanceof EnnardEntity) {
				((EnnardEntity) entity).setAnimation("empty");
			}
			if (entity instanceof NeddbearEntity) {
				((NeddbearEntity) entity).setAnimation("empty");
			}
			if (entity instanceof FuntimeDelilahEntity) {
				((FuntimeDelilahEntity) entity).setAnimation("empty");
			}
			if (entity instanceof MrHippoEntity) {
				((MrHippoEntity) entity).setAnimation("empty");
			}
			if (entity instanceof OrvilleElephantEntity) {
				((OrvilleElephantEntity) entity).setAnimation("empty");
			}
			if (entity instanceof LeftyEntity) {
				((LeftyEntity) entity).setAnimation("empty");
			}
		}
	}
}
