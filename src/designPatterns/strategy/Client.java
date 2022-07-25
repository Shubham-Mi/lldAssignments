package designPatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        SolutionRegistry solutionRegistry = new SolutionRegistry();
        solutionRegistry.register(SolutionMode.BRUTEFORCE, new BruteforceSolutionStrategy());
        solutionRegistry.register(SolutionMode.PREFIX_SUM, new PrefixSumSolutionStrategy());
        solutionRegistry.register(SolutionMode.TWO_POINTER, new TwoPointerSolutionStrategy());
        RainwaterTrappingProblem rainwaterTrappingProblem = new RainwaterTrappingProblem(solutionRegistry);

        List<Integer> lst= new ArrayList<>();
        lst.add(0);
        lst.add(1);
        lst.add(0);
        lst.add(2);
        lst.add(1);
        lst.add(0);
        lst.add(1);
        lst.add(3);
        lst.add(2);
        lst.add(1);
        lst.add(2);
        lst.add(1);
        System.out.println(rainwaterTrappingProblem.solveProblem(lst, SolutionMode.BRUTEFORCE));
        System.out.println(rainwaterTrappingProblem.solveProblem(lst, SolutionMode.PREFIX_SUM));
        System.out.println(rainwaterTrappingProblem.solveProblem(lst, SolutionMode.TWO_POINTER));
    }
}
