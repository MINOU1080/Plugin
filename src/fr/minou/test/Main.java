package fr.minou.test;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("-----------------------------");
        System.out.println("Dev by MINOU");
        System.out.println("ON");
        System.out.println("-----------------------------");
    }

    @Override
    public void onDisable() {
        System.out.println("-----------------------------");
        System.out.println("Dev by MINOU");
        System.out.println("OFF");
        System.out.println("-----------------------------");
    }
}
