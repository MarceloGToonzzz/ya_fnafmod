
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.yafnafmod.client.gui.WallCreatorScreen;
import net.mcreator.yafnafmod.client.gui.MonitorWorkGuiScreen;
import net.mcreator.yafnafmod.client.gui.LockerGuiScreen;
import net.mcreator.yafnafmod.client.gui.FridgeIndustrialGUIScreen;
import net.mcreator.yafnafmod.client.gui.FridgeGUIScreen;
import net.mcreator.yafnafmod.client.gui.FatLetterUiScreen;
import net.mcreator.yafnafmod.client.gui.CabinetScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YaFnafmodModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(YaFnafmodModMenus.LOCKER_GUI.get(), LockerGuiScreen::new);
			MenuScreens.register(YaFnafmodModMenus.WALL_CREATOR.get(), WallCreatorScreen::new);
			MenuScreens.register(YaFnafmodModMenus.CABINET.get(), CabinetScreen::new);
			MenuScreens.register(YaFnafmodModMenus.MONITOR_WORK_GUI.get(), MonitorWorkGuiScreen::new);
			MenuScreens.register(YaFnafmodModMenus.FAT_LETTER_UI.get(), FatLetterUiScreen::new);
			MenuScreens.register(YaFnafmodModMenus.FRIDGE_GUI.get(), FridgeGUIScreen::new);
			MenuScreens.register(YaFnafmodModMenus.FRIDGE_INDUSTRIAL_GUI.get(), FridgeIndustrialGUIScreen::new);
		});
	}
}
