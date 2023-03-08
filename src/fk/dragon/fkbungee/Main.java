package fk.dragon.fkbungee;

import org.bukkit.plugin.java.JavaPlugin;

import fk.dragon.fkbungee.commands.LobbyCommand;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		System.out.println("Salut la console !");
	    getCommand("lobby").setExecutor(new LobbyCommand(this));
	    getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
	}

	@Override
	public void onDisable() {
		System.out.println("Au revoir la console !");
	}
}
