public class Array2 {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }

    public int centeredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            min = nums[i] < min ? nums[i] : min;
            max = nums[i] > max ? nums[i] : max;
            sum = sum + nums[i];
        }
        return (sum - (min + max)) / (nums.length - 2);
    }

    public int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i = i + 1;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int flag = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) flag = 1;
            if (flag == 0) count = count + nums[i];
            if (nums[i] == 7) flag = 0;
        }
        return count;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) count++;
        }
        return count * 2 == 8;
    }

    public boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        return ones > fours;
    }

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (!(nums[i] == 1 || nums[i] == 4)) {
                return false;
            }
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + "";
        }
        return arr;
    }

    public boolean no14(int[] nums) {
        boolean x = true;
        boolean y = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                x = false;
            }
            if (nums[i] == 1) {
                y = false;
            }
        }
        return x || y;
    }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val && nums[i + 1] != val) return false;
        }
        return true;
    }

    public boolean either24(int[] nums) {
        boolean twos = false;
        boolean fours = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) twos = true;
            if (nums[i] == 4 && nums[i + 1] == 4) fours = true;
        }
        return twos != fours;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            int difference = Math.abs(nums1[i] - nums2[i]);
            if (difference > 0 && difference <= 2) {
                count++;
            }
        }
        return count;
    }

    public boolean has77(int[] nums) {
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i] + "";
        }
        if (str.contains("77")) {
            return true;
        }
        for (int i = 0; i < 10; i++) {
            if (str.contains("7" + i + "7")) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean ibefore = false;
        boolean thereIs2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                thereIs2 = false;
                ibefore = true;
            }
            if (nums[i] == 2) {
                thereIs2 = true;
            }
        }
        return ibefore && thereIs2;
    }

    public boolean modThree(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int even = 0, notEven = 0, before = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
                notEven = 0;
            } else {
                notEven++;
                even = 0;
            }
            max = Math.max(Math.max(even, notEven), max);
        }
        return (max >= 3);
    }

    public boolean haveThree(int[] nums) {
        int count = 0;

        if (nums.length >= 1 && nums[0] == 3)
            count++;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 3 && nums[i] == 3)
                return false;

            if (nums[i] == 3)
                count++;
        }

        return count == 3;
    }

    public boolean twoTwo(int[] nums) {
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
        }
        return !str.replace("22", "").contains("2") || !str.replace("222", "").contains("2");
    }

    public boolean sameEnds(int[] nums, int len) {
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
        }
        return str.substring(0, len).equals(str.substring(str.length() - len, str.length()));
    }

    public boolean tripleUp(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int last = nums[0];
        int times = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last == 1) {
                if (++times == 3) {
                    return true;
                }
            } else {
                times = 1;
            }
            last = nums[i];
        }
        return false;
    }

    public int[] fizzArray3(int start, int end) {
        int[] arr = new int[end - start];
        for (int i = 0; start < end; start++, i++) {
            arr[i] = start;
        }
        return arr;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] arr = new int[nums.length];
        arr[nums.length - 1] = nums[0];
        for (int i = 0, j = 1; j < nums.length; i++, j++) {
            arr[i] = nums[j];
        }
        return arr;
    }

    public int[] tenRun(int[] nums) {
        boolean go = false;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                go = true;
                last = nums[i];
            }
            if (go) {
                if (nums[i] % 10 != 0) {
                    nums[i] = last;
                }
            }
        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                break;
            }
            size++;
        }
        int[] arr = new int[size];
        System.arraycopy(nums, 0, arr, 0, size);
        return arr;
    }

    public int[] post4(int[] nums) {
        int i = nums.length - 1;

        while (nums[i] != 4)
            i--;

        int[] arr = new int[nums.length - i - 1];

        for (int j = 0; j < arr.length; j++)
            arr[j] = nums[i + j + 1];

        return arr;
    }

    public int[] notAlone(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val && i != 0 && i != nums.length - 1 && nums[i - 1] != val && nums[i + 1] != val) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] arr = new int[nums.length];
        int cZ = 0, cO = 0, x = 0;
        for (int i = 0; i < nums.length; i++) {
            cZ += (nums[i] == 0) ? 1 : 0;
            cO += (nums[i] != 0) ? 1 : 0;
            x = (nums[i] != 0) ? nums[i] : x;
        }
        for (int i = 0; i < cZ; i++) {
            arr[i] = 0;
        }
        for (int i = cZ; i < cO + cZ; i++) {
            arr[i] = x;
        }
        return arr;
    }

    public int[] withoutTen(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int max = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 == 1) {
                        max = Math.max(max, nums[j]);
                    }
                }
                nums[i] = max;
            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] arr = new int[nums.length];
        int cO = 0, cE = 0, xO = 0, xE = 0;
        for (int i = 0; i < nums.length; i++) {
            cE += (nums[i] % 2 == 0) ? 1 : 0;
            cO += (nums[i] % 2 == 1) ? 1 : 0;
            xO = (nums[i] % 2 == 1) ? nums[i] : xO;
            xE = (nums[i] % 2 == 0) ? nums[i] : xE;
        }
        for (int i = 0; i < cE; i++) {
            arr[i] = xE;
        }
        for (int i = cE; i < cO + cE; i++) {
            arr[i] = xO;
        }
        return arr;
    }

    public String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }

        return arr;
    }

}
