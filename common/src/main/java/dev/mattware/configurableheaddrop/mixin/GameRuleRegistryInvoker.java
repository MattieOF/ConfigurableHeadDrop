package dev.mattware.configurableheaddrop.mixin;

import net.minecraft.world.level.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(GameRules.class)
public interface GameRuleRegistryInvoker {
    @Invoker("register") public static <T extends GameRules.Value<T>> GameRules.Key<T> invokeRegister(String name, GameRules.Category category, GameRules.Type<T> rule) {
        throw new AssertionError();
    }
}
