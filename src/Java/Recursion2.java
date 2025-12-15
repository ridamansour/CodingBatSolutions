package Java;

public class Recursion2 {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return (target == 0);
        if (groupSum(start + 1, nums, target - nums[start])) return true;
        return groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (nums[start] == 6)
            return groupSum6(start + 1, nums, target - 6);

        if (groupSum6(start + 1, nums, target - nums[start]))
            return true;

        return groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (groupNoAdj(start + 2, nums, target - nums[start]))
            return true;

        return groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        if (nums[start] % 5 == 0) {
            if (start <= nums.length - 2 && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);

            return groupSum5(start + 1, nums, target - nums[start]);
        }

        if (groupSum5(start + 1, nums, target - nums[start]))
            return true;

        return groupSum5(start + 1, nums, target);
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;

        int i = start;
        int sum = 0;

        while (i < nums.length && nums[start] == nums[i]) {
            sum += nums[i];
            i++;
        }

        if (groupSumClump(i, nums, target - sum))
            return true;

        return groupSumClump(i, nums, target);
    }

    public boolean splitArray(int[] nums) {
        return splitArrayHelper(0, nums, 0, 0);
    }

    public boolean splitArrayHelper(int start, int[] nums, int group1,
                                    int group2) {
        if (start >= nums.length)
            return group1 == group2;

        if (splitArrayHelper(start + 1, nums, group1 + nums[start], group2))
            return true;

        return splitArrayHelper(start + 1, nums, group1, group2 + nums[start]);
    }

    public boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0, nums, 0, 0);
    }

    public boolean splitOdd10Helper(int start, int[] nums, int mult, int odd) {
        if (start >= nums.length)
            return mult % 10 == 0 && odd % 2 == 1;

        if (splitOdd10Helper(start + 1, nums, mult + nums[start], odd))
            return true;

        return splitOdd10Helper(start + 1, nums, mult, odd + nums[start]);
    }

    public boolean split53(int[] nums) {
        return split53Helper(0, nums, 0, 0);
    }

    public boolean split53Helper(int start, int[] nums, int mult5, int mult3) {
        if (start >= nums.length)
            return mult5 == mult3;

        if (nums[start] % 5 == 0)
            return split53Helper(start + 1, nums, mult5 + nums[start], mult3);

        if (nums[start] % 3 == 0)
            return split53Helper(start + 1, nums, mult5, mult3 + nums[start]);

        if (split53Helper(start + 1, nums, mult5 + nums[start], mult3))
            return true;

        return split53Helper(start + 1, nums, mult5, mult3 + nums[start]);
    }
}
