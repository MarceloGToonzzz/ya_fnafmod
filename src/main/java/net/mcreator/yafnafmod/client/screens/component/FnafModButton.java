package net.mcreator.yafnafmod.client.screens.component;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;


public class FnafModButton extends Button {
    private static final ResourceLocation WIDGETS = new ResourceLocation("ya_fnafmod:block/screens/widgets/unselected_button.png");
    private static final int BUTTON_WIDTH = 200;
    private static final int BUTTON_HEIGHT = 20;


    public FnafModButton(int x, int y, Component message, OnPress onPress) {
        super(x, y, BUTTON_WIDTH, BUTTON_HEIGHT, message, onPress, DEFAULT_NARRATION);
    }

    @Override
    public void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        Minecraft mc = Minecraft.getInstance();

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, WIDGETS);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();

        int yOffset = this.isHoveredOrFocused() ? BUTTON_HEIGHT : 0;
        graphics.blit(WIDGETS, this.getX(), this.getY(), 0, yOffset, this.width, this.height, 200, 40);

        int color = this.active ? 0xFFFFFF : 0xA0A0A0;
        graphics.drawCenteredString(mc.font, this.getMessage(), this.getX() + this.width / 2, this.getY() + (this.height - 8) / 2, color);
    }
}


