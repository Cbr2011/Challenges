package net.mcreator.cbrmodschallenges.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class ListofchallengesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("List of commands to summon these challanges: " + ("/summon_challenge Dream " + ("/summon_challenge Dragon " + "All the commands for now ")))), false);
	}
}
