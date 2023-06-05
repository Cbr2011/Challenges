
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbrmodschallenges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.cbrmodschallenges.item.IphoneItem;
import net.mcreator.cbrmodschallenges.CbrmodsChallengesMod;

public class CbrmodsChallengesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CbrmodsChallengesMod.MODID);
	public static final RegistryObject<Item> DREAM_SPAWN_EGG = REGISTRY.register("dream_spawn_egg", () -> new ForgeSpawnEggItem(CbrmodsChallengesModEntities.DREAM, -3342592, -1, new Item.Properties()));
	public static final RegistryObject<Item> IPHONE = REGISTRY.register("iphone", () -> new IphoneItem());
}
