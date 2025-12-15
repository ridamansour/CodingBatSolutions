package Java;

public class Array3 {
    public int maxSpan(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while (nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if (span > max)
                max = span;
        }

        return max;
    }

    public int[] fix34(int[] nums) {
        int i = 0;

        while (i < nums.length && nums[i] != 3)
            i++;

        int j = i + 1;

        while (j < nums.length && nums[j] != 4)
            j++;

        while (i < nums.length) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while (j < nums.length && nums[j] != 4)
                    j++;
            }
            i++;
        }

        return nums;
    }

    public int[] fix45(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length && nums[j] != 5)
            j++;

        while (i < nums.length) {
            if (nums[i] == 4) {
                int temp = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = temp;

                while ((j < nums.length && nums[j] != 5) || j == i + 1)
                    j++;
            }
            i++;
        }

        return nums;
    }

    public boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++)
            second += nums[i];

        for (int i = 0; i <= nums.length - 2; i++) {
            first += nums[i];
            second -= nums[i];

            if (first == second)
                return true;
        }

        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while (i < inner.length && j < outer.length) {
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }

        return i == inner.length;
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n * n];

        if (n == 0)
            return arr;

        for (int i = n - 1; i < arr.length; i += n) {
            for (int j = i; j >= i - i / n; j--)
                arr[j] = i - j + 1;
        }

        return arr;
    }

    public int[] seriesUp(int n) {
        int[] arr = new int[n * (n + 1) / 2];

        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                arr[index + j] = j + 1;
            }
            index += i;
        }

        return arr;
    }

    public int maxMirror(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public int countClumps(int[] arr) {
        int count = 0;
        int prev = Integer.MIN_VALUE;
        boolean inClump = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prev) {
                if (!inClump) {
                    inClump = true;
                    count++;
                }
            } else {
                inClump = false;
            }

            prev = arr[i];
        }

        return count;
    }

}
