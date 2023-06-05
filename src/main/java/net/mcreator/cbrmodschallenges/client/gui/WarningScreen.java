package net.mcreator.cbrmodschallenges.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.cbrmodschallenges.world.inventory.WarningMenu;
import net.mcreator.cbrmodschallenges.network.WarningButtonMessage;
import net.mcreator.cbrmodschallenges.CbrmodsChallengesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WarningScreen extends AbstractContainerScreen<WarningMenu> {
	private final static HashMap<String, Object> guistate = WarningMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_i_dont_care_start_the_challeng;
	Button button_on_second_thought;

	public WarningScreen(WarningMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 403;
		this.imageHeight = 212;
	}

	private static final ResourceLocation texture = new ResourceLocation("cbrmods_challenges:textures/screens/warning.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_wait"), 11, 6, -6750208);
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_are_you_sure_you_wanna_do_this"), 235, 6, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_this_challange_can_destory_your"), 12, 24, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_destory_your_hardworked_hous"), 14, 39, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_if_youre_the_owner_of_the_serve"), 5, 75, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_muiltiplayer"), 6, 59, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.cbrmods_challenges.warning.label_please_make_a_backup_before_star"), 6, 89, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_i_dont_care_start_the_challeng = Button.builder(Component.translatable("gui.cbrmods_challenges.warning.button_i_dont_care_start_the_challeng"), e -> {
			if (true) {
				CbrmodsChallengesMod.PACKET_HANDLER.sendToServer(new WarningButtonMessage(0, x, y, z));
				WarningButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 8, this.topPos + 185, 197, 20).build();
		guistate.put("button:button_i_dont_care_start_the_challeng", button_i_dont_care_start_the_challeng);
		this.addRenderableWidget(button_i_dont_care_start_the_challeng);
		button_on_second_thought = Button.builder(Component.translatable("gui.cbrmods_challenges.warning.button_on_second_thought"), e -> {
			if (true) {
				CbrmodsChallengesMod.PACKET_HANDLER.sendToServer(new WarningButtonMessage(1, x, y, z));
				WarningButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 274, this.topPos + 185, 119, 20).build();
		guistate.put("button:button_on_second_thought", button_on_second_thought);
		this.addRenderableWidget(button_on_second_thought);
	}
}
