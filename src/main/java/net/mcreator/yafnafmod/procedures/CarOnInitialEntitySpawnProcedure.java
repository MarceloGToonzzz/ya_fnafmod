package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.yafnafmod.entity.CarStationWagonEntity;
import net.mcreator.yafnafmod.entity.CarHarleyMotorcycleEntity;
import net.mcreator.yafnafmod.entity.CarFazvanEntity;

public class CarOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String strong = "";
		double test = 0;
		if (!(entity instanceof CarHarleyMotorcycleEntity)) {
			strong = "summon ya_fnafmod:car_seat ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {og_car: CAR_UUID,car_seat: 1}}".replace("CAR_UUID", entity.getStringUUID());
			if (entity instanceof CarFazvanEntity) {
				test = 1;
				for (int index0 = 0; index0 < 7; index0++) {
					strong = ("summon ya_fnafmod:car_seat ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {og_car: CAR_UUID,car_seat: ZESEAT}}".replace("ZESEAT", "" + test)).replace("CAR_UUID", entity.getStringUUID());
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), strong);
					test = test + 1;
				}
			} else if (entity instanceof CarStationWagonEntity) {
				test = 1;
				for (int index1 = 0; index1 < 3; index1++) {
					strong = ("summon ya_fnafmod:car_seat ~ ~ ~ {Brain: {memories: {}}, HurtByTimestamp: 0, ForgeData: {og_car: CAR_UUID,car_seat: ZESEAT}}".replace("ZESEAT", "" + test)).replace("CAR_UUID", entity.getStringUUID());
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), strong);
					test = test + 1;
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), strong);
			}
		}
	}
}
