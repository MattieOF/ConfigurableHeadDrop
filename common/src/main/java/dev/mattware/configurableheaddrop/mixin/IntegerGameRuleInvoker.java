package dev.mattware.configurableheaddrop.mixin;

import net.minecraft.world.level.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(GameRules.IntegerValue.class)
public interface IntegerGameRuleInvoker {
    @Invoker("create") public static GameRules.Type<GameRules.IntegerValue> invokeCreate(int i) {
        throw new AssertionError();
    }
}
