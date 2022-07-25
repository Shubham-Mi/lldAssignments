package designPatterns.strategy;

import java.util.List;

public class RainwaterTrappingProblem {
    private SolutionRegistry solutionRegistry;

    public RainwaterTrappingProblem(SolutionRegistry solutionRegistry) {
        this.solutionRegistry = solutionRegistry;
    }

    public int solveProblem(List<Integer> heights, SolutionMode solutionMode) {
        RainwaterTrappingStrategy rainwaterTrappingStrategy = solutionRegistry.getStrategy(solutionMode);
        return rainwaterTrappingStrategy.solveRainwaterTrappingProblem(heights);
    }
}
