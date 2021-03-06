package info.clo5de.economyex.invoke;

import com.kunyihua.crafte.api.Bukkit.BukkitKyctAPI;
import info.clo5de.economyex.EconomyExtended;

import static org.bukkit.Bukkit.getServer;

public class KycraftInvoke {

    private BukkitKyctAPI api;

    public KycraftInvoke () {}

    public void invoke () {
        if (getServer().getPluginManager().getPlugin("Kycraft") == null) {
            EconomyExtended.logger.warning("Kycraft is needed! Please make sure your server install it.");
            getServer().getPluginManager().disablePlugin(EconomyExtended.INSTANCE);
        } else {
            this.api = new BukkitKyctAPI();
        }
    }

    public BukkitKyctAPI getApi () {
        return this.api;
    }

}
