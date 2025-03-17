package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.init.YaFnafmodModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaskEffectsProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("hiding_mask") == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 15, 1));
		} else if (entity.getPersistentData().getBoolean("wearing_shock_collar") == true) {
			if (((world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("controlshock_x"), entity.getPersistentData().getDouble("controlshock_y"), entity.getPersistentData().getDouble("controlshock_z")))).getBlock()
					.getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip7
							? (world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("controlshock_x"), entity.getPersistentData().getDouble("controlshock_y"), entity.getPersistentData().getDouble("controlshock_z"))))
									.getValue(_getip7)
							: -1) == 1
					&& (world.getBlockState(BlockPos.containing(entity.getPersistentData().getDouble("controlshock_x"), entity.getPersistentData().getDouble("controlshock_y"), entity.getPersistentData().getDouble("controlshock_z"))))
							.getBlock() == YaFnafmodModBlocks.SHOCK_INFUSER.get()
					|| ((world.getBlockState(BlockPos.containing((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_x"),
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_y"),
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_z")))).getBlock().getStateDefinition()
							.getProperty("blockstate") instanceof IntegerProperty _getip20
									? (world.getBlockState(BlockPos.containing((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_x"),
											(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_y"),
											(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_z")))).getValue(_getip20)
									: -1) == 1
							&& (world.getBlockState(BlockPos.containing((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_x"),
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_y"),
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("shock_z")))).getBlock() == YaFnafmodModBlocks.SHOCK_INFUSER.get()) {
				if (entity instanceof Player) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("what the sigma"), false);
				}
				if (entity.getPersistentData().getBoolean("played_shock_sound") == false) {
					if (world instanceof Level)
						((Level) world).playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ya_fnafmod:controlshock_shock")), SoundSource.NEUTRAL, 1, 1);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("played_shock_sound", true);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (entity.getPersistentData().getDouble("shock_tick") > 18) {
					entity.getPersistentData().putDouble("shock_tick", 0);
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("played_shock_sound", false);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (entity.getPersistentData().getDouble("shock_tick") == 0 || entity.getPersistentData().getDouble("shock_tick") == 3 || entity.getPersistentData().getDouble("shock_tick") == 6
						|| entity.getPersistentData().getDouble("shock_tick") == 9 || entity.getPersistentData().getDouble("shock_tick") == 12 || entity.getPersistentData().getDouble("shock_tick") == 15
						|| entity.getPersistentData().getDouble("shock_tick") == 18) {
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("ya_fnafmod:controlled_shock")))), 1);
				}
				if (entity.getPersistentData().getBoolean("GotCordinates") == true) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("x")), (entity.getPersistentData().getDouble("y")), (entity.getPersistentData().getDouble("z")), 2);
				}
				entity.getPersistentData().putDouble("shock_tick", (entity.getPersistentData().getDouble("shock_tick") + 1));
			}
		}
	}
}
