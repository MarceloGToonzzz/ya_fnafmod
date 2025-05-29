
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
import net.mcreator.yafnafmod.client.gui.WackyWartPasteAdScreen;
import net.mcreator.yafnafmod.client.gui.PeppersPickledPopcornAdScreen;
import net.mcreator.yafnafmod.client.gui.MonitorWorkGuiScreen;
import net.mcreator.yafnafmod.client.gui.MartysPlungersAdScreen;
import net.mcreator.yafnafmod.client.gui.LockerGuiScreen;
import net.mcreator.yafnafmod.client.gui.LallysLolliesAdScreen;
import net.mcreator.yafnafmod.client.gui.FridgeIndustrialGUIScreen;
import net.mcreator.yafnafmod.client.gui.FridgeGUIScreen;
import net.mcreator.yafnafmod.client.gui.FlosFlossyFlossAdScreen;
import net.mcreator.yafnafmod.client.gui.FiztimeSodaPopAdScreen;
import net.mcreator.yafnafmod.client.gui.FatLetterUiScreen;
import net.mcreator.yafnafmod.client.gui.ElChipAdScreen;
import net.mcreator.yafnafmod.client.gui.CustomPizzeriaSignGUIScreen;
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
			MenuScreens.register(YaFnafmodModMenus.FIZTIME_SODA_POP_AD.get(), FiztimeSodaPopAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.LALLYS_LOLLIES_AD.get(), LallysLolliesAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.FLOS_FLOSSY_FLOSS_AD.get(), FlosFlossyFlossAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.WACKY_WART_PASTE_AD.get(), WackyWartPasteAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.MARTYS_PLUNGERS_AD.get(), MartysPlungersAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.EL_CHIP_AD.get(), ElChipAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.PEPPERS_PICKLED_POPCORN_AD.get(), PeppersPickledPopcornAdScreen::new);
			MenuScreens.register(YaFnafmodModMenus.CUSTOM_PIZZERIA_SIGN_GUI.get(), CustomPizzeriaSignGUIScreen::new);
		});
	}
}
