package net.mcreator.yafnafmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.mcreator.yafnafmod.configuration.YafnafmodConfigConfiguration;
import net.mcreator.yafnafmod.YaFnafmodMod;

@Mod.EventBusSubscriber(modid = YaFnafmodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class YaFnafmodModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, YafnafmodConfigConfiguration.SPEC, "yafnafmod_entityconfig.toml");
		});
	}
}
