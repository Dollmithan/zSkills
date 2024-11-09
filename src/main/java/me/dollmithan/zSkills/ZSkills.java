package me.dollmithan.zSkills;

import org.bukkit.plugin.java.JavaPlugin;

public final class ZSkills extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new SkillEventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
