package Java;

import java.util.ArrayList;
import java.util.List;

public class AP1 {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) return false;
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] == 100 && scores[i] == 100) return true;
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] < 3) return true;
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        return Math.max(average(scores, 0, scores.length / 2), average(scores, scores.length / 2, scores.length));
    }

    public int average(int[] scores, int start, int end) {
        int nums = 0;
        for (int i = start; i < end; i++) {
            nums += scores[i];
        }
        return nums / (end - start);
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] wordsToN = new String[n];
        System.arraycopy(words, 0, wordsToN, 0, n);
        return wordsToN;
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                a.add(words[i]);
            }
        }
        return a;
    }

    public boolean hasOne(int n) {
        while (n != 0) {
            if (n % 10 == 1) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public boolean dividesSelf(int n) {
        String[] arr = (n + "").split("");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == 0) {
                return false;
            }
            if (n % Integer.parseInt(arr[i]) != 0) {
                return false;
            }
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (nums[i] % 2 == 0) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (isEndy(nums[i])) {
                arr[j++] = nums[i];
            }
        }
        return arr;
    }

    public boolean isEndy(int num) {
        return (num <= 10 && num >= 0) || (num <= 100 && num >= 90);
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (!(a[i].equals("") || b[i].equals(""))) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int grade = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                grade += 4;
            } else if (!answers[i].equals("?")) {
                grade--;
            }
        }
        return grade;
    }

    public String[] wordsWithout(String[] words, String target) {
        int size = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                size--;
            }
        }
        String[] arr = new String[size];
        for (int i = 0, j = 0; j < size; i++) {
            if (!words[i].equals(target)) {
                arr[j++] = words[i];
            }
        }
        return arr;
    }

    public int scoresSpecial(int[] a, int[] b) {
        int maxA = 0, maxB = 0;
        for (int i = 0; i < a.length; i++) {
            maxA = (a[i] % 10 == 0) ? Math.max(maxA, a[i]) : maxA;

        }
        for (int i = 0; i < b.length; i++) {
            maxB = (b[i] % 10 == 0) ? Math.max(maxB, b[i]) : maxB;
        }

        return maxA + maxB;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0; //(Math.abs(heights[start] - heights[start+1]))*2;
        for (int i = start; i < end; i++) {
            if (heights[i] < heights[i + 1])
                sum = sum + 2 * (heights[i + 1] - heights[i]);
            else
                sum = sum + heights[i] - heights[i + 1];
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += (Math.abs(heights[i] - heights[i + 1]) >= 5) ? (1) : 0;
        }
        return sum;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        if (aId == bId) {
            return 0;
        } else if (aName.equals(bName)) {
            return (aId > bId) ? 1 : -1;
        }
        for (int i = 0; i < Math.min(bName.length(), aName.length()); i++) {
            if (aName.charAt(i) < bName.charAt(i)) {
                return -1;
            }
            if (aName.charAt(i) > bName.charAt(i)) {
                return 1;
            }
        }
        return (bName.length() > aName.length()) ? -1 : 1;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] done = new String[n];
        String str = "";
        for (int i = 0; i < a.length; i++) {
            str += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            str += b[i];
        }

        String min = "z";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (min.charAt(0) > str.charAt(j)) {
                    min = str.charAt(j) + "";

                }
            }
            done[i] = min;
            String[] arr = str.split(min);
            str = "";
            for (int boo = 0; boo < arr.length; boo++) {
                str += arr[boo];
            }
            min = "z";
        }
        return done;
    }

    public int commonTwo(String[] a, String[] b) {
        ArrayList<String> aSetClone = new ArrayList<String>();
        for (char i = 'a'; i <= 'z'; i++) {
            if (contains(a, i)) {
                aSetClone.add(i + "");
            }
        }
        int count = 0;
        for (int i = 0; i < aSetClone.size(); i++) {
            if (contains(b, aSetClone.get(i).charAt(0))) {
                count++;
            }
        }
        return count;
    }

    public boolean contains(String[] a, char chr) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].charAt(0) == chr) {
                return true;
            }
        }
        return false;
    }
}
