module Vault {
    requires java.logging;
    requires EssentialsGroupManager;
    requires VaultAPI;
    requires bstats.base;
    requires bstats.bukkit;
    requires json.simple;
    requires org.bukkit;
    requires org.json.simple;

    exports net.milkbowl.vault;
}
