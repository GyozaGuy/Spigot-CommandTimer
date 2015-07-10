package com.gyozaguy;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandTimer extends JavaPlugin {
	private Server server = Bukkit.getServer();
	
	@Override
	public void onEnable() {
		// TODO
		try {
			wait(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onDisable() {
		// TODO
	}
}
