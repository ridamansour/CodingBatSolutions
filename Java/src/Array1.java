public class Array1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0) {
            return nums[0] == nums[nums.length - 1];
        }
        return false;
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        int max = nums[0] > nums[2] ? nums[0] : nums[2];

        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3)
                return true;
        }

        return false;
    }

    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3)
                return false;
        }

        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] arr = new int[2 * nums.length];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    public boolean double23(int[] nums) {
        int i = nums.length - 1;
        int count3 = 0, count2 = 0;
        while (i >= 0) {
            if (nums[i] == 2) {
                count2++;
                if (count2 == 2) {
                    return true;
                }
            }
            if (nums[i] == 3) {
                count3++;
                if (count3 == 2) {
                    return true;
                }
            }
            i--;
        }
        return false;

    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0) {
            if (a[0] == 1) {
                count++;
            }
        }
        if (b.length > 0) {
            if (b[0] == 1) {
                count++;
            }
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sum = a[0] + a[1] - b[0] - b[1];
        if (sum >= 0)
            return a;
        return b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] midArr = new int[2];
        int mid = nums.length / 2;
        midArr[0] = nums[mid - 1];
        midArr[1] = nums[mid];
        return midArr;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] combArr = {a[0], a[1], b[0], b[1]};
        return combArr;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

    public int maxTriple(int[] nums) {
        int max = nums[0];
        if (max < nums[nums.length - 1])
            max = nums[nums.length - 1];
        if (max < nums[nums.length / 2])
            max = nums[nums.length / 2];
        return max;
    }

    public int[] frontPiece(int[] nums) {
        int[] front;
        if (nums.length >= 2) {
            front = new int[2];
            front[0] = nums[0];
            front[1] = nums[1];
        } else if (nums.length == 1) {
            front = new int[1];
            front[0] = nums[0];
        } else
            front = new int[0];
        return front;
    }

    public boolean unlucky1(int[] nums) {
        int lastP = nums.length - 1;
        if (lastP >= 2) {
            if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
                return true;
            return (nums[lastP - 1] == 1 && nums[lastP] == 3);
        }
        if (lastP == 1) {
            return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3);
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] comb = new int[2];
        if (a.length >= 2) {
            comb[0] = a[0];
            comb[1] = a[1];
        } else if (a.length == 1) {
            comb[0] = a[0];
            comb[1] = b[0];
        } else {
            comb[0] = b[0];
            comb[1] = b[1];
        }
        return comb;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) return new int[]{a[0], b[0]};
        if (a.length > 0) return new int[]{a[0]};
        if (b.length > 0) return new int[]{b[0]};
        return new int[]{};
    }

}
