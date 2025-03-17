package net.mcreator.yafnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.yafnafmod.world.inventory.FatLetterUiMenu;
import net.mcreator.yafnafmod.network.FatLetterUiButtonMessage;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FatLetterUiScreen extends AbstractContainerScreen<FatLetterUiMenu> {
	private final static HashMap<String, Object> guistate = FatLetterUiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_a;
	Button button_b;
	Button button_c;
	Button button_d;
	Button button_e;
	Button button_f;
	Button button_g;
	Button button_h;
	Button button_i;
	Button button_j;
	Button button_k;
	Button button_l;
	Button button_m;
	Button button_n;
	Button button_o;
	Button button_p;
	Button button_q;
	Button button_r;
	Button button_s;
	Button button_t;
	Button button_u;
	Button button_v;
	Button button_w;
	Button button_x;
	Button button_y;
	Button button_z;

	public FatLetterUiScreen(FatLetterUiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 231;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ya_fnafmod:textures/screens/fat_letter_ui.png");

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
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.ya_fnafmod.fat_letter_ui.label_choose_a_letter_then"), 79, 115, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ya_fnafmod.fat_letter_ui.label_rightclick_a_letter_block"), 79, 124, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_a = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_a"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(0, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 7, 30, 20).build();
		guistate.put("button:button_a", button_a);
		this.addRenderableWidget(button_a);
		button_b = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_b"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(1, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 43, this.topPos + 7, 30, 20).build();
		guistate.put("button:button_b", button_b);
		this.addRenderableWidget(button_b);
		button_c = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_c"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(2, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 79, this.topPos + 7, 30, 20).build();
		guistate.put("button:button_c", button_c);
		this.addRenderableWidget(button_c);
		button_d = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_d"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(3, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 7, 30, 20).build();
		guistate.put("button:button_d", button_d);
		this.addRenderableWidget(button_d);
		button_e = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_e"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(4, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 151, this.topPos + 7, 30, 20).build();
		guistate.put("button:button_e", button_e);
		this.addRenderableWidget(button_e);
		button_f = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_f"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(5, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 187, this.topPos + 7, 30, 20).build();
		guistate.put("button:button_f", button_f);
		this.addRenderableWidget(button_f);
		button_g = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_g"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(6, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 34, 30, 20).build();
		guistate.put("button:button_g", button_g);
		this.addRenderableWidget(button_g);
		button_h = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_h"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(7, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 43, this.topPos + 34, 30, 20).build();
		guistate.put("button:button_h", button_h);
		this.addRenderableWidget(button_h);
		button_i = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_i"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(8, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 79, this.topPos + 34, 30, 20).build();
		guistate.put("button:button_i", button_i);
		this.addRenderableWidget(button_i);
		button_j = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_j"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(9, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 34, 30, 20).build();
		guistate.put("button:button_j", button_j);
		this.addRenderableWidget(button_j);
		button_k = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_k"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(10, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}).bounds(this.leftPos + 151, this.topPos + 34, 30, 20).build();
		guistate.put("button:button_k", button_k);
		this.addRenderableWidget(button_k);
		button_l = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_l"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(11, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}).bounds(this.leftPos + 187, this.topPos + 34, 30, 20).build();
		guistate.put("button:button_l", button_l);
		this.addRenderableWidget(button_l);
		button_m = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_m"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(12, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_m", button_m);
		this.addRenderableWidget(button_m);
		button_n = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_n"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(13, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}).bounds(this.leftPos + 43, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_n", button_n);
		this.addRenderableWidget(button_n);
		button_o = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_o"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(14, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}).bounds(this.leftPos + 79, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_o", button_o);
		this.addRenderableWidget(button_o);
		button_p = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_p"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(15, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_p", button_p);
		this.addRenderableWidget(button_p);
		button_q = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_q"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(16, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}).bounds(this.leftPos + 151, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_q", button_q);
		this.addRenderableWidget(button_q);
		button_r = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_r"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(17, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}).bounds(this.leftPos + 187, this.topPos + 61, 30, 20).build();
		guistate.put("button:button_r", button_r);
		this.addRenderableWidget(button_r);
		button_s = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_s"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(18, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_s", button_s);
		this.addRenderableWidget(button_s);
		button_t = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_t"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(19, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}).bounds(this.leftPos + 43, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_t", button_t);
		this.addRenderableWidget(button_t);
		button_u = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_u"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(20, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}).bounds(this.leftPos + 79, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_u", button_u);
		this.addRenderableWidget(button_u);
		button_v = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_v"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(21, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_v", button_v);
		this.addRenderableWidget(button_v);
		button_w = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_w"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(22, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 22, x, y, z);
			}
		}).bounds(this.leftPos + 151, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_w", button_w);
		this.addRenderableWidget(button_w);
		button_x = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_x"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(23, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 23, x, y, z);
			}
		}).bounds(this.leftPos + 187, this.topPos + 88, 30, 20).build();
		guistate.put("button:button_x", button_x);
		this.addRenderableWidget(button_x);
		button_y = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_y"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(24, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 24, x, y, z);
			}
		}).bounds(this.leftPos + 7, this.topPos + 115, 30, 20).build();
		guistate.put("button:button_y", button_y);
		this.addRenderableWidget(button_y);
		button_z = Button.builder(Component.translatable("gui.ya_fnafmod.fat_letter_ui.button_z"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new FatLetterUiButtonMessage(25, x, y, z));
				FatLetterUiButtonMessage.handleButtonAction(entity, 25, x, y, z);
			}
		}).bounds(this.leftPos + 43, this.topPos + 115, 30, 20).build();
		guistate.put("button:button_z", button_z);
		this.addRenderableWidget(button_z);
	}
}
