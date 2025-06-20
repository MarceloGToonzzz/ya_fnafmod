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
		RX = LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").substring((int) LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").indexOf("X") + "X".length(),
				(int) LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").lastIndexOf("X"));
		RY = LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").substring((int) LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").indexOf("Y") + "Y".length(),
				(int) LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").lastIndexOf("Y"));
		RZ = LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").substring((int) LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").indexOf("Z") + "Z".length(),
				(int) LookyLooProcedure.execute(world, x, y, z, "ya_fnafmod:ennard_mask").lastIndexOf("Z"));
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
