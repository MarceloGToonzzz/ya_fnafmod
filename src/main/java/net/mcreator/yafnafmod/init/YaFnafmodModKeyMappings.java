
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yafnafmod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.yafnafmod.network.TestMessage;
import net.mcreator.yafnafmod.network.DrivingRightMessage;
import net.mcreator.yafnafmod.network.DrivingLeftMessage;
import net.mcreator.yafnafmod.network.DrivingForwardMessage;
import net.mcreator.yafnafmod.network.DrivingBackwardMessage;
import net.mcreator.yafnafmod.network.CarAcceleratingMessage;
import net.mcreator.yafnafmod.YaFnafmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class YaFnafmodModKeyMappings {
	public static final KeyMapping TEST = new KeyMapping("key.ya_fnafmod.test", GLFW.GLFW_KEY_APOSTROPHE, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new TestMessage(0, 0));
				TestMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DRIVING_FORWARD = new KeyMapping("key.ya_fnafmod.driving_forward", GLFW.GLFW_KEY_W, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingForwardMessage(0, 0));
				DrivingForwardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DRIVING_FORWARD_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DRIVING_FORWARD_LASTPRESS);
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingForwardMessage(1, dt));
				DrivingForwardMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DRIVING_LEFT = new KeyMapping("key.ya_fnafmod.driving_left", GLFW.GLFW_KEY_A, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingLeftMessage(0, 0));
				DrivingLeftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DRIVING_LEFT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DRIVING_LEFT_LASTPRESS);
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingLeftMessage(1, dt));
				DrivingLeftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DRIVING_RIGHT = new KeyMapping("key.ya_fnafmod.driving_right", GLFW.GLFW_KEY_D, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingRightMessage(0, 0));
				DrivingRightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DRIVING_RIGHT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DRIVING_RIGHT_LASTPRESS);
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingRightMessage(1, dt));
				DrivingRightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping DRIVING_BACKWARD = new KeyMapping("key.ya_fnafmod.driving_backward", GLFW.GLFW_KEY_S, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingBackwardMessage(0, 0));
				DrivingBackwardMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				DRIVING_BACKWARD_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - DRIVING_BACKWARD_LASTPRESS);
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new DrivingBackwardMessage(1, dt));
				DrivingBackwardMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping CAR_ACCELERATING = new KeyMapping("key.ya_fnafmod.car_accelerating", GLFW.GLFW_KEY_LEFT_CONTROL, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new CarAcceleratingMessage(0, 0));
				CarAcceleratingMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				CAR_ACCELERATING_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - CAR_ACCELERATING_LASTPRESS);
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new CarAcceleratingMessage(1, dt));
				CarAcceleratingMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long DRIVING_FORWARD_LASTPRESS = 0;
	private static long DRIVING_LEFT_LASTPRESS = 0;
	private static long DRIVING_RIGHT_LASTPRESS = 0;
	private static long DRIVING_BACKWARD_LASTPRESS = 0;
	private static long CAR_ACCELERATING_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(TEST);
		event.register(DRIVING_FORWARD);
		event.register(DRIVING_LEFT);
		event.register(DRIVING_RIGHT);
		event.register(DRIVING_BACKWARD);
		event.register(CAR_ACCELERATING);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				TEST.consumeClick();
				DRIVING_FORWARD.consumeClick();
				DRIVING_LEFT.consumeClick();
				DRIVING_RIGHT.consumeClick();
				DRIVING_BACKWARD.consumeClick();
				CAR_ACCELERATING.consumeClick();
			}
		}
	}
}
