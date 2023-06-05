
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbrmodschallenges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.cbrmodschallenges.CbrmodsChallengesMod;

public class CbrmodsChallengesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CbrmodsChallengesMod.MODID);
	public static final RegistryObject<SoundEvent> SHOTONIPHONE = REGISTRY.register("shotoniphone", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("cbrmods_challenges", "shotoniphone")));
}
