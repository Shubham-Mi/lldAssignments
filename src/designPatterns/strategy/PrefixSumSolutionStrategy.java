package designPatterns.strategy;

import java.util.List;

public class PrefixSumSolutionStrategy implements RainwaterTrappingStrategy{
    @Override
    public int solveRainwaterTrappingProblem(List<Integer> heights) {
        int n = heights.size();
        int left[] = new int[n];
        int right[] = new int[n];
        int res = 0;

        left[0] = heights.get(0);
        for (int i=1; i<n; ++i) {
            left[i] = Math.max(left[i - 1], heights.get(i));
        }
        right[n - 1] = heights.get(n - 1);
        for (int i=n-2; i>=0; --i) {
            right[i] = Math.max(right[i + 1], heights.get(i));
        }
        for (int i=0; i<n; ++i) {
            res += Math.min(left[i], right[i]) - heights.get(i);
        }
        return res;
    }
}
