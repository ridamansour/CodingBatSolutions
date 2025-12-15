public class Warmup2 {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;
    }

    public boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        if (i + 1 >= str.length()) return false;
        return str.substring(i + 1, i + 2).equals("x");
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result = result + str.substring(i, i + 1);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }

        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }

        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }

    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }

    public String altPairs(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }
        return result;
    }

    public String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }

    public int array667(int[] nums) {
        int count = 0;

        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {

        for (int i = 0; i < (nums.length - 2); i++) {
            int first = nums[i];
            if (nums[i + 1] == first && nums[i + 2] == first) return false;
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }


}
