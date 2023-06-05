
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cbrmodschallenges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.cbrmodschallenges.world.inventory.WarningMenu;
import net.mcreator.cbrmodschallenges.CbrmodsChallengesMod;

public class CbrmodsChallengesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CbrmodsChallengesMod.MODID);
	public static final RegistryObject<MenuType<WarningMenu>> WARNING = REGISTRY.register("warning", () -> IForgeMenuType.create(WarningMenu::new));
}
