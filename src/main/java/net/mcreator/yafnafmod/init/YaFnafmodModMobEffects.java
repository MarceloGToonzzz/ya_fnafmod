
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.yafnafmod.potion.QuantumLockMobEffect;
import net.mcreator.yafnafmod.YaFnafmodMod;

public class YaFnafmodModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, YaFnafmodMod.MODID);
	public static final RegistryObject<MobEffect> QUANTUM_LOCK = REGISTRY.register("quantum_lock", () -> new QuantumLockMobEffect());
}
