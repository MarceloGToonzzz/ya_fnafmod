package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.yafnafmod.init.YaFnafmodModItems;
import net.mcreator.yafnafmod.entity.SpringbonnieDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyEntity;
import net.mcreator.yafnafmod.entity.RockstarFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RockstarChicaDayEntity;
import net.mcreator.yafnafmod.entity.RockstarBonnieDayEntity;
import net.mcreator.yafnafmod.entity.RetroFreddyDayEntity;
import net.mcreator.yafnafmod.entity.RetroFoxyDayEntity;
import net.mcreator.yafnafmod.entity.RetroChicaDayEntity;
import net.mcreator.yafnafmod.entity.RetroBonnieDayEntity;
import net.mcreator.yafnafmod.entity.PigpatchDayEntity;
import net.mcreator.yafnafmod.entity.PanStanDayEntity;
import net.mcreator.yafnafmod.entity.OrvilleElephantDayEntity;
import net.mcreator.yafnafmod.entity.NumberOneCrateDayEntity;
import net.mcreator.yafnafmod.entity.NeddBearDayEntity;
import net.mcreator.yafnafmod.entity.MrHugsDayEntity;
import net.mcreator.yafnafmod.entity.MrHippoDayEntity;
import net.mcreator.yafnafmod.entity.MrCanDoDayEntity;
import net.mcreator.yafnafmod.entity.HappyFrogDayEntity;
import net.mcreator.yafnafmod.entity.FredbearDayEntity;
import net.mcreator.yafnafmod.entity.BucketBobDayEntity;

public class AnimatronicRotationProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double result = 0;
		if (itemstack.getItem() == YaFnafmodModItems.FAZWRENCH.get()) {
			if (entity.getYRot() == 0 || entity.getYRot() == 45 || entity.getYRot() == 90 || entity.getYRot() == 135 || entity.getYRot() == 180 || entity.getYRot() == 225 || entity.getYRot() == 270 || entity.getYRot() == 315
					|| entity.getYRot() == 360) {
				result = entity.getYRot() + 45;
				entity.getPersistentData().putDouble("yaw", result);
				{
					Entity _ent = entity;
					_ent.setYRot((float) result);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				entity.getPersistentData().putDouble("yaw", (entity.getYRot()));
			} else {
				entity.getPersistentData().putDouble("yaw", 0);
				{
					Entity _ent = entity;
					_ent.setYRot(0);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
			}
		} else if (itemstack.getItem() == YaFnafmodModItems.SHOCK_CABLES.get()) {
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("ya_fnafmod:control_shock")))) {
				if (itemstack.getOrCreateTag().getBoolean("shock_selected") == true) {
					entity.getPersistentData().putBoolean("controlshock_linked", true);
					entity.getPersistentData().putDouble("controlshock_x", (itemstack.getOrCreateTag().getDouble("shock_x")));
					entity.getPersistentData().putDouble("controlshock_y", (itemstack.getOrCreateTag().getDouble("shock_y")));
					entity.getPersistentData().putDouble("controlshock_z", (itemstack.getOrCreateTag().getDouble("shock_z")));
					if (sourceentity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Animatronic linked to Shock Infuser!"), false);
				}
			}
		} else if (itemstack.getItem() == YaFnafmodModItems.REMNANT.get() || itemstack.getItem() == YaFnafmodModItems.AGONY.get()) {
			if (DoesAnimatronicWalkAtNightProcedure.execute(entity) == false) {
				if (entity instanceof FredbearDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(FredbearDayEntity.DATA_walker, true);
				if (entity instanceof SpringbonnieDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(SpringbonnieDayEntity.DATA_walker, true);
				if (entity instanceof RetroFreddyDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RetroFreddyDayEntity.DATA_walker, true);
				if (entity instanceof RetroBonnieDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RetroBonnieDayEntity.DATA_walker, true);
				if (entity instanceof RetroChicaDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RetroChicaDayEntity.DATA_walker, true);
				if (entity instanceof RetroFoxyDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RetroFoxyDayEntity.DATA_walker, true);
				if (entity instanceof MrHugsDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(MrHugsDayEntity.DATA_walker, true);
				if (entity instanceof MrCanDoDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(MrCanDoDayEntity.DATA_walker, true);
				if (entity instanceof PanStanDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PanStanDayEntity.DATA_walker, true);
				if (entity instanceof BucketBobDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(BucketBobDayEntity.DATA_walker, true);
				if (entity instanceof NumberOneCrateDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(NumberOneCrateDayEntity.DATA_walker, true);
				if (entity instanceof NeddBearDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(NeddBearDayEntity.DATA_walker, true);
				if (entity instanceof PigpatchDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(PigpatchDayEntity.DATA_walker, true);
				if (entity instanceof MrHippoDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(MrHippoDayEntity.DATA_walker, true);
				if (entity instanceof HappyFrogDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(HappyFrogDayEntity.DATA_walker, true);
				if (entity instanceof OrvilleElephantDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(OrvilleElephantDayEntity.DATA_walker, true);
				if (entity instanceof RockstarFreddyDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RockstarFreddyDayEntity.DATA_walker, true);
				if (entity instanceof RockstarBonnieDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RockstarBonnieDayEntity.DATA_walker, true);
				if (entity instanceof RockstarChicaDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RockstarChicaDayEntity.DATA_walker, true);
				if (entity instanceof RockstarFoxyDayEntity _datEntSetL)
					_datEntSetL.getEntityData().set(RockstarFoxyDayEntity.DATA_walker, true);
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = itemstack;
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
			}
		} else if (itemstack.getItem() == YaFnafmodModItems.FAZCOIN.get()) {
			if (entity instanceof RockstarFreddyEntity) {
				if ((entity.getPersistentData().getDouble("state") == 1 || entity.getPersistentData().getDouble("state") == 2) && entity.getPersistentData().getDouble("coin") < 5) {
					entity.getPersistentData().putDouble("coin", (entity.getPersistentData().getDouble("coin") + 1));
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = itemstack;
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
		if (itemstack.getItem() == YaFnafmodModItems.SKIN_CHANGER_TOOL.get()) {
			if (GetSkinAmmountProcedure.execute(entity) != 0) {
				if (entity.getPersistentData().getDouble("skin") != GetSkinAmmountProcedure.execute(entity)) {
					entity.getPersistentData().putDouble("skin", (entity.getPersistentData().getDouble("skin") + 1));
				} else {
					entity.getPersistentData().putDouble("skin", 0);
				}
				SettingSkinProcedure.execute(entity, entity.getPersistentData().getDouble("skin"), entity.getPersistentData().getDouble("style"));
			}
		} else if (itemstack.getItem() == YaFnafmodModItems.FAT.get()) {
			if (entity.getPersistentData().getDouble("style") == 0) {
				entity.getPersistentData().putDouble("style", 1);
			} else {
				entity.getPersistentData().putDouble("style", 0);
			}
			SettingSkinProcedure.execute(entity, entity.getPersistentData().getDouble("skin"), entity.getPersistentData().getDouble("style"));
		}
	}
}
