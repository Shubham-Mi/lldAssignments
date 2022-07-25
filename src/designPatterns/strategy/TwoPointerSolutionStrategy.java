package designPatterns.strategy;

import java.util.List;

public class TwoPointerSolutionStrategy implements RainwaterTrappingStrategy{
    @Override
    public int solveRainwaterTrappingProblem(List<Integer> heights) {
        int n = heights.size();
        int left = 0;
        int right = n - 1;
        int l_max = 0;
        int r_max = 0;
        int res = 0;

        while (left <= right) {
            if (r_max <= l_max) {
                res += Math.max(0, r_max - heights.get(right));
                r_max = Math.max(r_max, heights.get(right));
                right--;
            }
            else {
                res += Math.max(0, l_max - heights.get(left));
                l_max = Math.max(l_max, heights.get(left));
                left++;
            }
        }

        return res;
    }
}
