package me.kitmycat.practiceMod

import org.bukkit.plugin.java.JavaPlugin

class PracticeMod : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Starting test plugin")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Disabling test plugin")
    }
}
