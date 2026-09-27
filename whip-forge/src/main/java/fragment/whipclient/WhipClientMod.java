package fragment.whipclient;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
    modid = "whipclient",
    name = "WhipClient",
    version = "0.1.0",
    acceptedMinecraftVersions = "[1.8.9]"
)
public final class WhipClientMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("[WhipClient] Forge 1.8.9 client loaded.");
    }
}
