package net.mcreator.yafnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.yafnafmod.world.inventory.MartysPlungersAdMenu;
import net.mcreator.yafnafmod.network.MartysPlungersAdButtonMessage;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MartysPlungersAdScreen extends AbstractContainerScreen<MartysPlungersAdMenu> {
	private final static HashMap<String, Object> guistate = MartysPlungersAdMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_skip;

	public MartysPlungersAdScreen(MartysPlungersAdMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
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

		guiGraphics.blit(new ResourceLocation("ya_fnafmod:textures/screens/martysplungersad.png"), this.leftPos + -12, this.topPos + -2, 0, 0, 196, 166, 196, 166);

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
	}

	@Override
	public void init() {
		super.init();
		button_skip = Button.builder(Component.translatable("gui.ya_fnafmod.martys_plungers_ad.button_skip"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new MartysPlungersAdButtonMessage(0, x, y, z));
				MartysPlungersAdButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 123, this.topPos + 133, 46, 20).build();
		guistate.put("button:button_skip", button_skip);
		this.addRenderableWidget(button_skip);
	}
}
