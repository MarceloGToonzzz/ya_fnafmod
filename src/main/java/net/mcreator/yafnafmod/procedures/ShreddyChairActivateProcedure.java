package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.yafnafmod.entity.ShreddyFazchairEntity;

public class ShreddyChairActivateProcedure {
	public static void execute(Entity shreddy) {
		if (shreddy == null)
			return;
		if (shreddy.getPersistentData().getBoolean("shredding") == false) {
			if (shreddy instanceof ShreddyFazchairEntity) {
				((ShreddyFazchairEntity) shreddy).setAnimation("animation.shreddy.shred");
			}
			shreddy.getPersistentData().putBoolean("shredding", true);
			shreddy.getPersistentData().putDouble("shred_tick", 0);
		}
	}
}
