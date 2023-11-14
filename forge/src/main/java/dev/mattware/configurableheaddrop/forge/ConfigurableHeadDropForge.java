package dev.mattware.configurableheaddrop.forge;

import dev.mattware.configurableheaddrop.ConfigurableHeadDrop;
import net.minecraftforge.fml.common.Mod;

@Mod(ConfigurableHeadDrop.MOD_ID)
public class ConfigurableHeadDropForge {
    public ConfigurableHeadDropForge() {
        ConfigurableHeadDrop.init();
    }
}
