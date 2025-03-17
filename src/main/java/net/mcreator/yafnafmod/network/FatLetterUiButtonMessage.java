
package net.mcreator.yafnafmod.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.yafnafmod.world.inventory.FatLetterUiMenu;
import net.mcreator.yafnafmod.procedures.FatLetterZProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterYProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterXProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterWProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterVProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterUProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterTProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterSProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterRProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterQProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterPProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterOProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterNProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterMProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterLProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterKProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterJProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterIProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterHProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterGProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterFProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterEProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterDProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterCProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterBProcedure;
import net.mcreator.yafnafmod.procedures.FatLetterAProcedure;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FatLetterUiButtonMessage {
	private final int buttonID, x, y, z;

	public FatLetterUiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public FatLetterUiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(FatLetterUiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(FatLetterUiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = FatLetterUiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			FatLetterAProcedure.execute(entity);
		}
		if (buttonID == 1) {

			FatLetterBProcedure.execute(entity);
		}
		if (buttonID == 2) {

			FatLetterCProcedure.execute(entity);
		}
		if (buttonID == 3) {

			FatLetterDProcedure.execute(entity);
		}
		if (buttonID == 4) {

			FatLetterEProcedure.execute(entity);
		}
		if (buttonID == 5) {

			FatLetterFProcedure.execute(entity);
		}
		if (buttonID == 6) {

			FatLetterGProcedure.execute(entity);
		}
		if (buttonID == 7) {

			FatLetterHProcedure.execute(entity);
		}
		if (buttonID == 8) {

			FatLetterIProcedure.execute(entity);
		}
		if (buttonID == 9) {

			FatLetterJProcedure.execute(entity);
		}
		if (buttonID == 10) {

			FatLetterKProcedure.execute(entity);
		}
		if (buttonID == 11) {

			FatLetterLProcedure.execute(entity);
		}
		if (buttonID == 12) {

			FatLetterMProcedure.execute(entity);
		}
		if (buttonID == 13) {

			FatLetterNProcedure.execute(entity);
		}
		if (buttonID == 14) {

			FatLetterOProcedure.execute(entity);
		}
		if (buttonID == 15) {

			FatLetterPProcedure.execute(entity);
		}
		if (buttonID == 16) {

			FatLetterQProcedure.execute(entity);
		}
		if (buttonID == 17) {

			FatLetterRProcedure.execute(entity);
		}
		if (buttonID == 18) {

			FatLetterSProcedure.execute(entity);
		}
		if (buttonID == 19) {

			FatLetterTProcedure.execute(entity);
		}
		if (buttonID == 20) {

			FatLetterUProcedure.execute(entity);
		}
		if (buttonID == 21) {

			FatLetterVProcedure.execute(entity);
		}
		if (buttonID == 22) {

			FatLetterWProcedure.execute(entity);
		}
		if (buttonID == 23) {

			FatLetterXProcedure.execute(entity);
		}
		if (buttonID == 24) {

			FatLetterYProcedure.execute(entity);
		}
		if (buttonID == 25) {

			FatLetterZProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		YaFnafmodMod.addNetworkMessage(FatLetterUiButtonMessage.class, FatLetterUiButtonMessage::buffer, FatLetterUiButtonMessage::new, FatLetterUiButtonMessage::handler);
	}
}
