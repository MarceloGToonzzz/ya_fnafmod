
package net.mcreator.yafnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;

import net.mcreator.yafnafmod.procedures.DrivingForwardOnKeyReleasedProcedure;
import net.mcreator.yafnafmod.procedures.DrivingForwardOnKeyPressedProcedure;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DrivingForwardMessage {
	int type, pressedms;

	public DrivingForwardMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public DrivingForwardMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(DrivingForwardMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(DrivingForwardMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;
		if (type == 0) {

			DrivingForwardOnKeyPressedProcedure.execute(entity);
		}
		if (type == 1) {

			DrivingForwardOnKeyReleasedProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		YaFnafmodMod.addNetworkMessage(DrivingForwardMessage.class, DrivingForwardMessage::buffer, DrivingForwardMessage::new, DrivingForwardMessage::handler);
	}
}
