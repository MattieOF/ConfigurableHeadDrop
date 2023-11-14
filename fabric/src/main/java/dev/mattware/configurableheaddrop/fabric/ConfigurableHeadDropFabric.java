package dev.mattware.configurableheaddrop.fabric;

import dev.mattware.configurableheaddrop.ConfigurableHeadDrop;
import net.fabricmc.api.ModInitializer;

public class ConfigurableHeadDropFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ConfigurableHeadDrop.init();
    }
}
