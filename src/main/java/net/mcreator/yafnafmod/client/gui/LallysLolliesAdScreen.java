package net.mcreator.yafnafmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.yafnafmod.world.inventory.LallysLolliesAdMenu;
import net.mcreator.yafnafmod.network.LallysLolliesAdButtonMessage;
import net.mcreator.yafnafmod.YaFnafmodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class LallysLolliesAdScreen extends AbstractContainerScreen<LallysLolliesAdMenu> {
	private final static HashMap<String, Object> guistate = LallysLolliesAdMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_skipbutton;

	public LallysLolliesAdScreen(LallysLolliesAdMenu container, Inventory inventory, Component text) {
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

		guiGraphics.blit(new ResourceLocation("ya_fnafmod:textures/screens/lallyslolliesad.png"), this.leftPos + -12, this.topPos + -2, 0, 0, 196, 166, 196, 166);

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
		imagebutton_skipbutton = new ImageButton(this.leftPos + 6, this.topPos + 133, 45, 20, 0, 0, 20, new ResourceLocation("ya_fnafmod:textures/screens/atlas/imagebutton_skipbutton.png"), 45, 40, e -> {
			if (true) {
				YaFnafmodMod.PACKET_HANDLER.sendToServer(new LallysLolliesAdButtonMessage(0, x, y, z));
				LallysLolliesAdButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_skipbutton", imagebutton_skipbutton);
		this.addRenderableWidget(imagebutton_skipbutton);
	}
}
