package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.Minireena2Entity;

public class Minireena2EntityIsHurtProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Minireena2Entity _datEntSetL)
			_datEntSetL.getEntityData().set(Minireena2Entity.DATA_has_player, false);
		if (entity instanceof Minireena2Entity _datEntSetS)
			_datEntSetS.getEntityData().set(Minireena2Entity.DATA_desired_player, "");
		entity.getPersistentData().putDouble("player_cooldown_tick", 0);
	}
}
