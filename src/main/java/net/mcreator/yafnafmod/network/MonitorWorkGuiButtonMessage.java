
package net.mcreator.yafnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.world.inventory.MonitorWorkGuiMenu;
import net.mcreator.yafnafmod.procedures.LurePress4Procedure;
import net.mcreator.yafnafmod.procedures.LurePress3Procedure;
import net.mcreator.yafnafmod.procedures.LurePress2Procedure;
import net.mcreator.yafnafmod.procedures.LurePress1Procedure;
import net.mcreator.yafnafmod.procedures.LurePageMoreProcedure;
import net.mcreator.yafnafmod.procedures.LurePageLessProcedure;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MonitorWorkGuiButtonMessage {
	private final int buttonID, x, y, z;

	public MonitorWorkGuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MonitorWorkGuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MonitorWorkGuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MonitorWorkGuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = MonitorWorkGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			LurePress1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			LurePress2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			LurePress3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			LurePress4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			LurePageLessProcedure.execute(world, x, y, z);
		}
		if (buttonID == 5) {

			LurePageMoreProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		YaFnafmodMod.addNetworkMessage(MonitorWorkGuiButtonMessage.class, MonitorWorkGuiButtonMessage::buffer, MonitorWorkGuiButtonMessage::new, MonitorWorkGuiButtonMessage::handler);
	}
}
