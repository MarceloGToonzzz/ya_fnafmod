package net.mcreator.yafnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.yafnafmod.world.inventory.MonitorWorkGuiMenu;
import net.mcreator.yafnafmod.procedures.LurePageShowProcedure;
import net.mcreator.yafnafmod.procedures.GetTextTimeProcedure;
import net.mcreator.yafnafmod.network.MonitorWorkGuiButtonMessage;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MonitorWorkGuiScreen extends AbstractContainerScreen<MonitorWorkGuiMenu> {
	private final static HashMap<String, Object> guistate = MonitorWorkGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_lure_1;
	Button button_lure_2;
	Button button_lure_3;
	Button button_lure_4;
	Button button_empty;
	Button button_empty1;

	public MonitorWorkGuiScreen(MonitorWorkGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 352;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(new ResourceLocation("ya_fnafmod:textures/screens/monitorwork_gui.png"), this.leftPos + 0, this.topPos + 0, 0, 0, 352, 166, 352, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				GetTextTimeProcedure.execute(world), 154, 10, -1, false);
		guiGraphics.drawString(this.font,

				LurePageShowProcedure.execute(world, x, y, z), 211, 32, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_lure_1 = Button.builder(Component.translatable("gui.ya_fnafmod.monitor_work_gui.button_lure_1"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MonitorWorkGuiButtonMessage(0, x, y, z));
				MonitorWorkGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 42, 56, 20).build();
		guistate.put("button:button_lure_1", button_lure_1);
		this.addRenderableWidget(button_lure_1);
		button_lure_2 = Button.builder(Component.translatable("gui.ya_fnafmod.monitor_work_gui.button_lure_2"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MonitorWorkGuiButtonMessage(1, x, y, z));
				MonitorWorkGuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 62, 56, 20).build();
		guistate.put("button:button_lure_2", button_lure_2);
		this.addRenderableWidget(button_lure_2);
		button_lure_3 = Button.builder(Component.translatable("gui.ya_fnafmod.monitor_work_gui.button_lure_3"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MonitorWorkGuiButtonMessage(2, x, y, z));
				MonitorWorkGuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 82, 56, 20).build();
		guistate.put("button:button_lure_3", button_lure_3);
		this.addRenderableWidget(button_lure_3);
		button_lure_4 = Button.builder(Component.translatable("gui.ya_fnafmod.monitor_work_gui.button_lure_4"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MonitorWorkGuiButtonMessage(3, x, y, z));
				MonitorWorkGuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 152, this.topPos + 102, 56, 20).build();
		guistate.put("button:button_lure_4", button_lure_4);
		this.addRenderableWidget(button_lure_4);
		button_empty = Button.builder(Component.translatable("gui.ya_fnafmod.monitor_work_gui.button_empty"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MonitorWorkGuiButtonMessage(4, x, y, z));
				MonitorWorkGuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 139, this.topPos + 139, 30, 20).build();
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.ya_fnafmod.monitor_work_gui.button_empty1"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MonitorWorkGuiButtonMessage(5, x, y, z));
				MonitorWorkGuiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 191, this.topPos + 139, 30, 20).build();
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
	}
}
