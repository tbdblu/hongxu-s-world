package net.mcreator.hongxusworld.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.hongxusworld.world.inventory.WatchmachineguiMenu;
import net.mcreator.hongxusworld.procedures.MoProcedure;
import net.mcreator.hongxusworld.network.WatchmachineguiButtonMessage;
import net.mcreator.hongxusworld.init.HongxusWorldModScreens;
import net.mcreator.hongxusworld.HongxusWorldMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class WatchmachineguiScreen extends AbstractContainerScreen<WatchmachineguiMenu> implements HongxusWorldModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_kai_shi_zhi_zuo;

	public WatchmachineguiScreen(WatchmachineguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 187;
		this.imageHeight = 225;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = new ResourceLocation("hongxus_world:textures/screens/hongxusworldmodmenus.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
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
		guiGraphics.drawString(this.font, Component.translatable("gui.hongxus_world.hongxusworldmodmenus.label_shou_biao_zhi_zuo_tai"), 81, 5, -16777216, false);
		if (MoProcedure.execute(world))
			guiGraphics.drawString(this.font, Component.translatable("gui.hongxus_world.hongxusworldmodmenus.label_empty"), 82, 99, -65485, false);
	}

	@Override
	public void init() {
		super.init();
		button_kai_shi_zhi_zuo = Button.builder(Component.translatable("gui.hongxus_world.hongxusworldmodmenus.button_kai_shi_zhi_zuo"), e -> {
			int x = WatchmachineguiScreen.this.x;
			int y = WatchmachineguiScreen.this.y;
			if (true) {
				HongxusWorldMod.PACKET_HANDLER.sendToServer(new WatchmachineguiButtonMessage(0, x, y, z));
				WatchmachineguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 129, this.topPos + 90, 46, 20).build();
		this.addRenderableWidget(button_kai_shi_zhi_zuo);
	}
}