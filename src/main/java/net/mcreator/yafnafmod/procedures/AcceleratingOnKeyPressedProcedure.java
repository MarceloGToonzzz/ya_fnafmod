package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;

public class AcceleratingOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("YAFNAF_CtrlAccelerate", 1);
	}
}
