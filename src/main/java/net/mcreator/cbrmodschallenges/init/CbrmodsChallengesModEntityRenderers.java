
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbrmodschallenges.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cbrmodschallenges.client.renderer.DreamRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CbrmodsChallengesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CbrmodsChallengesModEntities.DREAM.get(), DreamRenderer::new);
	}
}
