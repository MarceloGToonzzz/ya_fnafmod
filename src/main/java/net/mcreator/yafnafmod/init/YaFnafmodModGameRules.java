
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class YaFnafmodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GENERATOR_NIGHT = GameRules.register("generatorNight", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> GENERATOR_MAX_CAPACITY = GameRules.register("generatorMaxCapacity", GameRules.Category.MISC, GameRules.IntegerValue.create(100));
	public static final GameRules.Key<GameRules.BooleanValue> ENABLE_VOICES = GameRules.register("enableVoices", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> ENABLE_JUMPSCARES = GameRules.register("enableJumpscares", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> SCOOPER_ALARM = GameRules.register("scooperAlarm", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> CHILD_EMOTION_METER = GameRules.register("childEmotionMeter", GameRules.Category.PLAYER, GameRules.IntegerValue.create(15));
}
