package net.mcreator.yafnafmod.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class WalkyTooProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String RX = "";
		String RY = "";
		String RZ = "";
		String wah = "";
		entity.getPersistentData().putDouble("walky_tick", (entity.getPersistentData().getDouble("walky_tick") + 1));
		if (entity.getPersistentData().getDouble("walky_tick") >= 100) {
			entity.getPersistentData().putDouble("walky_tick", 0);
			wah = LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask");
			RX = wah.substring((int) wah.indexOf("X") + "X".length(), (int) wah.lastIndexOf("X"));
			RY = wah.substring((int) wah.indexOf("Y") + "Y".length(), (int) wah.lastIndexOf("Y"));
			RZ = wah.substring((int) wah.indexOf("Z") + "Z".length(), (int) wah.lastIndexOf("Z"));
			if (new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(RY) != -200) {
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(RX), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(RY), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(RZ), 1);
			}
		}
	}
}
