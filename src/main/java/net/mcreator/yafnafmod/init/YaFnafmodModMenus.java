
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.yafnafmod.world.inventory.WallCreatorMenu;
import net.mcreator.yafnafmod.world.inventory.MonitorWorkGuiMenu;
import net.mcreator.yafnafmod.world.inventory.LockerGuiMenu;
import net.mcreator.yafnafmod.world.inventory.FridgeIndustrialGUIMenu;
import net.mcreator.yafnafmod.world.inventory.FridgeGUIMenu;
import net.mcreator.yafnafmod.world.inventory.FatLetterUiMenu;
import net.mcreator.yafnafmod.world.inventory.CabinetMenu;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class YaFnafmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, YaFnafmodMod.MODID);
	public static final RegistryObject<MenuType<LockerGuiMenu>> LOCKER_GUI = REGISTRY.register("locker_gui", () -> IForgeMenuType.create(LockerGuiMenu::new));
	public static final RegistryObject<MenuType<WallCreatorMenu>> WALL_CREATOR = REGISTRY.register("wall_creator", () -> IForgeMenuType.create(WallCreatorMenu::new));
	public static final RegistryObject<MenuType<CabinetMenu>> CABINET = REGISTRY.register("cabinet", () -> IForgeMenuType.create(CabinetMenu::new));
	public static final RegistryObject<MenuType<MonitorWorkGuiMenu>> MONITOR_WORK_GUI = REGISTRY.register("monitor_work_gui", () -> IForgeMenuType.create(MonitorWorkGuiMenu::new));
	public static final RegistryObject<MenuType<FatLetterUiMenu>> FAT_LETTER_UI = REGISTRY.register("fat_letter_ui", () -> IForgeMenuType.create(FatLetterUiMenu::new));
	public static final RegistryObject<MenuType<FridgeGUIMenu>> FRIDGE_GUI = REGISTRY.register("fridge_gui", () -> IForgeMenuType.create(FridgeGUIMenu::new));
	public static final RegistryObject<MenuType<FridgeIndustrialGUIMenu>> FRIDGE_INDUSTRIAL_GUI = REGISTRY.register("fridge_industrial_gui", () -> IForgeMenuType.create(FridgeIndustrialGUIMenu::new));
}
