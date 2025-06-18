package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpringlockTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (IsEntityWearingHidingSuitProcedure.execute(entity)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.WATER
					|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == YaFnafmodModBlocks.WATER_PUDDLE.get()
					|| world.getLevelData().isRaining() && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))
							&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ya_fnafmod:umbrella")))
									|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("ya_fnafmod:umbrella"))))) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), (float) 0.5);
				if (entity instanceof LivingEntity _livingEntity)
					_livingEntity.addEffect((new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false)));
			}
			if (entity instanceof LivingEntity _livingEntity)
				_livingEntity.addEffect((new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false)));
		}
	}
}
