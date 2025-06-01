package net.mcreator.yafnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.yafnafmod.world.inventory.CustomPizzeriaSignGUIMenu;
import net.mcreator.yafnafmod.network.CustomPizzeriaSignGUIButtonMessage;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CustomPizzeriaSignGUIScreen extends AbstractContainerScreen<CustomPizzeriaSignGUIMenu> {
	private final static HashMap<String, Object> guistate = CustomPizzeriaSignGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox TextLine1;
	EditBox TextLine2;
	EditBox SignHexCode;
	Checkbox UniformFont;
	Button button_apply;

	public CustomPizzeriaSignGUIScreen(CustomPizzeriaSignGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 113;
	}

	private static final ResourceLocation texture = new ResourceLocation("ya_fnafmod:textures/screens/custom_pizzeria_sign_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		TextLine1.render(guiGraphics, mouseX, mouseY, partialTicks);
		TextLine2.render(guiGraphics, mouseX, mouseY, partialTicks);
		SignHexCode.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (TextLine1.isFocused())
			return TextLine1.keyPressed(key, b, c);
		if (TextLine2.isFocused())
			return TextLine2.keyPressed(key, b, c);
		if (SignHexCode.isFocused())
			return SignHexCode.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TextLine1.tick();
		TextLine2.tick();
		SignHexCode.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String TextLine1Value = TextLine1.getValue();
		String TextLine2Value = TextLine2.getValue();
		String SignHexCodeValue = SignHexCode.getValue();
		super.resize(minecraft, width, height);
		TextLine1.setValue(TextLine1Value);
		TextLine2.setValue(TextLine2Value);
		SignHexCode.setValue(SignHexCodeValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.label_text_color"), 4, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.label_text"), 4, 34, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		TextLine1 = new EditBox(this.font, this.leftPos + 5, this.topPos + 46, 118, 18, Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine1")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine1").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine1").getString());
				else
					setSuggestion(null);
			}
		};
		TextLine1.setSuggestion(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine1").getString());
		TextLine1.setMaxLength(32767);
		guistate.put("text:TextLine1", TextLine1);
		this.addWidget(this.TextLine1);
		TextLine2 = new EditBox(this.font, this.leftPos + 5, this.topPos + 66, 118, 18, Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine2")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine2").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine2").getString());
				else
					setSuggestion(null);
			}
		};
		TextLine2.setSuggestion(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.TextLine2").getString());
		TextLine2.setMaxLength(32767);
		guistate.put("text:TextLine2", TextLine2);
		this.addWidget(this.TextLine2);
		SignHexCode = new EditBox(this.font, this.leftPos + 5, this.topPos + 13, 118, 18, Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.SignHexCode"));
		SignHexCode.setMaxLength(32767);
		guistate.put("text:SignHexCode", SignHexCode);
		this.addWidget(this.SignHexCode);
		button_apply = Button.builder(Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.button_apply"), e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new CustomPizzeriaSignGUIButtonMessage(0, x, y, z));
				CustomPizzeriaSignGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 99, this.topPos + 88, 51, 20).build();
		guistate.put("button:button_apply", button_apply);
		this.addRenderableWidget(button_apply);
		UniformFont = new Checkbox(this.leftPos + 140, this.topPos + 54, 20, 20, Component.translatable("gui.ya_fnafmod.custom_pizzeria_sign_gui.UniformFont"), false);
		guistate.put("checkbox:UniformFont", UniformFont);
		this.addRenderableWidget(UniformFont);
	}
}
