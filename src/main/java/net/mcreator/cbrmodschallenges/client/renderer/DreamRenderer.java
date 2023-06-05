
package net.mcreator.cbrmodschallenges.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cbrmodschallenges.entity.DreamEntity;
import net.mcreator.cbrmodschallenges.client.model.Modelcustom_model;

public class DreamRenderer extends MobRenderer<DreamEntity, Modelcustom_model<DreamEntity>> {
	public DreamRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DreamEntity entity) {
		return new ResourceLocation("cbrmods_challenges:textures/entities/dadfc66d020025255e9491e0012f1cec229b02bd.png");
	}
}
