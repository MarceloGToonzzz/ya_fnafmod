package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.yafnafmod.network.YaFnafmodModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class SetHalloweenProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double chance = 0;
		if (IsItNighttimeProcedure.execute(world) == true) {
			if (YaFnafmodModVariables.MapVariables.get(world).hasset_halloween == false) {
				if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == 6 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 13) {
					if (chance == 1) {
						YaFnafmodModVariables.MapVariables.get(world).halloween_night = true;
						YaFnafmodModVariables.MapVariables.get(world).syncData(world);
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76You feel the halloween spirit within your soul.."), false);
					} else {
						YaFnafmodModVariables.MapVariables.get(world).halloween_night = false;
						YaFnafmodModVariables.MapVariables.get(world).syncData(world);
					}
				} else if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 31 && Calendar.getInstance().get(Calendar.MONTH) == 9) {
					YaFnafmodModVariables.MapVariables.get(world).halloween_night = true;
					YaFnafmodModVariables.MapVariables.get(world).syncData(world);
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76You feel the halloween spirit within your soul.."), false);
				} else {
					chance = Mth.nextInt(RandomSource.create(), 1, 31);
					if (chance == 1) {
						YaFnafmodModVariables.MapVariables.get(world).halloween_night = true;
						YaFnafmodModVariables.MapVariables.get(world).syncData(world);
						if (!world.isClientSide() && world.getServer() != null)
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A76You feel the halloween spirit within your soul.."), false);
					} else {
						YaFnafmodModVariables.MapVariables.get(world).halloween_night = false;
						YaFnafmodModVariables.MapVariables.get(world).syncData(world);
					}
				}
				YaFnafmodModVariables.MapVariables.get(world).hasset_halloween = true;
				YaFnafmodModVariables.MapVariables.get(world).syncData(world);
			}
			if (YaFnafmodModVariables.MapVariables.get(world).hasset_rare == false) {
				chance = Mth.nextInt(RandomSource.create(), 1, 25);
				if (chance == 1) {
					YaFnafmodModVariables.MapVariables.get(world).rare_night = true;
					YaFnafmodModVariables.MapVariables.get(world).syncData(world);
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74You feel a rare presence in the air.."), false);
				} else {
					YaFnafmodModVariables.MapVariables.get(world).rare_night = false;
					YaFnafmodModVariables.MapVariables.get(world).syncData(world);
				}
				YaFnafmodModVariables.MapVariables.get(world).hasset_rare = true;
				YaFnafmodModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			YaFnafmodModVariables.MapVariables.get(world).hasset_halloween = false;
			YaFnafmodModVariables.MapVariables.get(world).syncData(world);
			YaFnafmodModVariables.MapVariables.get(world).halloween_night = false;
			YaFnafmodModVariables.MapVariables.get(world).syncData(world);
			YaFnafmodModVariables.MapVariables.get(world).hasset_rare = false;
			YaFnafmodModVariables.MapVariables.get(world).syncData(world);
			YaFnafmodModVariables.MapVariables.get(world).rare_night = false;
			YaFnafmodModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
