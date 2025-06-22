package net.mcreator.yafnafmod;


import net.mcreator.yafnafmod.configuration.YafnafmodConfigConfiguration;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.tuple.Pair;

@Mod.EventBusSubscriber(modid = YaFnafmodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class Config {
    public static final ForgeConfigSpec CLIENT_SPEC;
    public static final YafnafmodConfigConfiguration CLIENT;

    static {
        {
            final Pair<YafnafmodConfigConfiguration, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(YafnafmodConfigConfiguration::new);
            CLIENT = specPair.getLeft();
            CLIENT_SPEC = specPair.getRight();
        }
    }
}
