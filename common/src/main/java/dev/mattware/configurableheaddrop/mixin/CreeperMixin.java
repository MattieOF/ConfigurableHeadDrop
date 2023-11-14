package dev.mattware.configurableheaddrop.mixin;

import dev.mattware.configurableheaddrop.ConfigurableHeadDrop;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Creeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Creeper.class)
public abstract class CreeperMixin {
    @Shadow public abstract boolean isPowered();

    @Shadow private int droppedSkulls;

    /**
     * @author Configurable Head Drop
     * @reason Allow configuration of maximum dropped skulls. I don't imagine this will cause incomps, but I might rework it later.
     */
    @Overwrite
    public boolean canDropMobsSkull() {
        int maxDrops = ((Entity) (Object) this).level().getGameRules().getInt(ConfigurableHeadDrop.MAX_CREEPER_HEAD_DROPS);
        return isPowered() && droppedSkulls < maxDrops;
    }
}
