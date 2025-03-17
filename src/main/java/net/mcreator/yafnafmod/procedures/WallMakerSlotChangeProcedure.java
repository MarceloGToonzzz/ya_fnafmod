package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.gui.components.Checkbox;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class WallMakerSlotChangeProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		boolean ExtraTile = false;
		boolean Big = false;
		String wall_id = "";
		String walltile_id = "";
		String result_wall = "";
		String ColorCombo = "";
		String StripeColor = "";
		wall_id = ForgeRegistries.ITEMS.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem())
				.toString();
		walltile_id = ForgeRegistries.ITEMS.getKey((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem())
				.toString();
		result_wall = wall_id;
		if (walltile_id.contains("wall_tile")) {
			ExtraTile = false;
		} else if (walltile_id.contains("wall_extra_tile")) {
			ExtraTile = true;
		}
		if (walltile_id.contains("big")) {
			Big = true;
		} else {
			Big = false;
		}
		if (walltile_id.contains("tile_red")) {
			StripeColor = "red_";
		} else if (walltile_id.contains("tile_black")) {
			StripeColor = "black_";
		} else if (walltile_id.contains("tile_purple")) {
			StripeColor = "purple_";
		}
		if (walltile_id.contains("black_white")) {
			ColorCombo = "";
		} else if (walltile_id.contains("green_blue")) {
			ColorCombo = "green_";
		} else if (walltile_id.contains("green_lime")) {
			ColorCombo = "lime_";
		}
		if (Big == true) {
			if (ExtraTile == true) {
				if (guistate.containsKey("checkbox:AlternateTile") && ((Checkbox) guistate.get("checkbox:AlternateTile")).selected()) {
					result_wall = wall_id + "_" + StripeColor + "extra_" + ColorCombo + "tiles_big_alternate";
				} else {
					result_wall = wall_id + "_" + StripeColor + "extra_" + ColorCombo + "tiles_big";
				}
			} else {
				if (guistate.containsKey("checkbox:AlternateTile") && ((Checkbox) guistate.get("checkbox:AlternateTile")).selected()) {
					result_wall = wall_id + "_" + StripeColor + ColorCombo + "tiles_big_alternate";
				} else {
					result_wall = wall_id + "_" + StripeColor + ColorCombo + "tiles_big";
				}
			}
		} else {
			if (ExtraTile == true) {
				if (guistate.containsKey("checkbox:AlternateTile") && ((Checkbox) guistate.get("checkbox:AlternateTile")).selected()) {
					result_wall = wall_id + "_" + StripeColor + "extra_" + ColorCombo + "tiles_alternate";
				} else {
					result_wall = wall_id + "_" + StripeColor + "extra_" + ColorCombo + "tiles";
				}
			} else {
				if (guistate.containsKey("checkbox:AlternateTile") && ((Checkbox) guistate.get("checkbox:AlternateTile")).selected()) {
					result_wall = wall_id + "_" + StripeColor + ColorCombo + "tiles_alternate";
				} else {
					result_wall = wall_id + "_" + StripeColor + ColorCombo + "tiles";
				}
			}
		}
		if (!(ForgeRegistries.ITEMS.getValue(new ResourceLocation((result_wall).toLowerCase(java.util.Locale.ENGLISH))) == Blocks.AIR.asItem())) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation((result_wall).toLowerCase(java.util.Locale.ENGLISH)))).copy();
				_setstack.setCount((int) (new Object() {
					public int getAmount(int sltid) {
						if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
							ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(2) + 1));
				((Slot) _slots.get(2)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(0)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
