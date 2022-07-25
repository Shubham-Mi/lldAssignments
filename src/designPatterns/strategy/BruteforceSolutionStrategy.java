package designPatterns.strategy;

import java.util.List;

public class BruteforceSolutionStrategy implements RainwaterTrappingStrategy{
    @Override
    public int solveRainwaterTrappingProblem(List<Integer> heights) {

        int res = 0;
        int n = heights.size();
        for (int i=0; i<n; ++i) {
            int left = heights.get(i);
            for (int j=0; j<i; ++j) {
                left = Math.max(left, heights.get(j));
            }
            int right = heights.get(i);
            for (int j=i+1; j<n; ++j) {
                right = Math.max(right, heights.get(j));
            }

            res = res + Math.min(left, right) - heights.get(i);
        }
        return res;
    }
}
