package designPatterns.strategy;

import java.util.HashMap;
import java.util.Map;

public class SolutionRegistry {
    private Map<SolutionMode, RainwaterTrappingStrategy> strategies = new HashMap<>();

    public void register(SolutionMode solutionMode, RainwaterTrappingStrategy rainwaterTrappingStrategy) {
        strategies.put(solutionMode, rainwaterTrappingStrategy);
    }

    public RainwaterTrappingStrategy getStrategy(SolutionMode solutionMode) {
        return strategies.get(solutionMode);
    }
}
