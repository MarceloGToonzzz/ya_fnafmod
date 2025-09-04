package net.mcreator.yafnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SpawnItemRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean done = false;
		double yaw = 0;
		double xex = 0;
		double yey = 0;
		double zez = 0;
		String og_registry = "";
		String command = "";
		String AI = "";
		String spawned = "";
		if (!itemstack.is(ItemTags.create(new ResourceLocation("ya_fnafmod:prop_entities")))) {
			og_registry = ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString();
			spawned = (ForgeRegistries.ITEMS.getKey(itemstack.getItem()).toString()).replace("_spawn_item", "_day");
			AI = "1";
			xex = Math.round(Math.pow(10, 0) * x) / Math.pow(10, 0) + 0.5;
			if (!(world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:slabs")))) {
				yey = Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) + 1;
			} else {
				yey = Math.round(Math.pow(10, 0) * y) / Math.pow(10, 0) + 1.5;
			}
			zez = Math.round(Math.pow(10, 0) * z) / Math.pow(10, 0) + 0.5;
			yaw = entity.getYRot() / 22.5;
			yaw = Math.round(yaw);
			yaw = yaw * 22.5;
			yaw = yaw + 180;
			command = ((("summon ENTITY XYZ {NoAI:MOOVEb,Rotation:[YAW]}".replace("YAW", yaw + "f")).replace("XYZ", (xex + " ") + "" + (yey + " ") + zez)).replace("MOOVE", AI)).replace("ENTITY", spawned);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), command);
		}
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = itemstack;
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
