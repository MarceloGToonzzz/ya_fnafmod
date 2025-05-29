
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
import net.mcreator.yafnafmod.world.inventory.WackyWartPasteAdMenu;
import net.mcreator.yafnafmod.world.inventory.PeppersPickledPopcornAdMenu;
import net.mcreator.yafnafmod.world.inventory.MonitorWorkGuiMenu;
import net.mcreator.yafnafmod.world.inventory.MartysPlungersAdMenu;
import net.mcreator.yafnafmod.world.inventory.LockerGuiMenu;
import net.mcreator.yafnafmod.world.inventory.LallysLolliesAdMenu;
import net.mcreator.yafnafmod.world.inventory.FridgeIndustrialGUIMenu;
import net.mcreator.yafnafmod.world.inventory.FridgeGUIMenu;
import net.mcreator.yafnafmod.world.inventory.FlosFlossyFlossAdMenu;
import net.mcreator.yafnafmod.world.inventory.FiztimeSodaPopAdMenu;
import net.mcreator.yafnafmod.world.inventory.FatLetterUiMenu;
import net.mcreator.yafnafmod.world.inventory.ElChipAdMenu;
import net.mcreator.yafnafmod.world.inventory.CustomPizzeriaSignGUIMenu;
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
	public static final RegistryObject<MenuType<FiztimeSodaPopAdMenu>> FIZTIME_SODA_POP_AD = REGISTRY.register("fiztime_soda_pop_ad", () -> IForgeMenuType.create(FiztimeSodaPopAdMenu::new));
	public static final RegistryObject<MenuType<LallysLolliesAdMenu>> LALLYS_LOLLIES_AD = REGISTRY.register("lallys_lollies_ad", () -> IForgeMenuType.create(LallysLolliesAdMenu::new));
	public static final RegistryObject<MenuType<FlosFlossyFlossAdMenu>> FLOS_FLOSSY_FLOSS_AD = REGISTRY.register("flos_flossy_floss_ad", () -> IForgeMenuType.create(FlosFlossyFlossAdMenu::new));
	public static final RegistryObject<MenuType<WackyWartPasteAdMenu>> WACKY_WART_PASTE_AD = REGISTRY.register("wacky_wart_paste_ad", () -> IForgeMenuType.create(WackyWartPasteAdMenu::new));
	public static final RegistryObject<MenuType<MartysPlungersAdMenu>> MARTYS_PLUNGERS_AD = REGISTRY.register("martys_plungers_ad", () -> IForgeMenuType.create(MartysPlungersAdMenu::new));
	public static final RegistryObject<MenuType<ElChipAdMenu>> EL_CHIP_AD = REGISTRY.register("el_chip_ad", () -> IForgeMenuType.create(ElChipAdMenu::new));
	public static final RegistryObject<MenuType<PeppersPickledPopcornAdMenu>> PEPPERS_PICKLED_POPCORN_AD = REGISTRY.register("peppers_pickled_popcorn_ad", () -> IForgeMenuType.create(PeppersPickledPopcornAdMenu::new));
	public static final RegistryObject<MenuType<CustomPizzeriaSignGUIMenu>> CUSTOM_PIZZERIA_SIGN_GUI = REGISTRY.register("custom_pizzeria_sign_gui", () -> IForgeMenuType.create(CustomPizzeriaSignGUIMenu::new));
}
