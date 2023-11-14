package dev.mattware.configurableheaddrop;

import dev.mattware.configurableheaddrop.mixin.GameRuleRegistryInvoker;
import dev.mattware.configurableheaddrop.mixin.IntegerGameRuleInvoker;
import net.minecraft.world.level.GameRules;

public class ConfigurableHeadDrop
{
	public static final String MOD_ID = "configurableheaddrop";
	public static GameRules.Key<GameRules.IntegerValue> MAX_CREEPER_HEAD_DROPS;

	public static void init() {
		MAX_CREEPER_HEAD_DROPS = GameRuleRegistryInvoker.invokeRegister("maxCreeperHeadDrops", GameRules.Category.DROPS, IntegerGameRuleInvoker.invokeCreate(1));
	}
}
