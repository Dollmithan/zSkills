package me.dollmithan.zSkills;

import me.dollmithan.CustomListeners.SkillLevelUpEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZSkills extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new SkillLevelUpEvent(), this);
    }

    @Override
    public void onDisable() {
    }
}
