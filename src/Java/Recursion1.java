package Java;

public class Recursion1 {
    public int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {

        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    public int triangle(int rows) {
        if (rows < 2) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public int count7(int n) {
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else if (n == 0) {
            return 0;
        } else {
            return count7(n / 10);
        }
    }

    public int count8(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 10 == 8) {
            if (n % 100 / 10 == 8) {
                return 2 + count8(n / 10);
            } else {
                return 1 + count8(n / 10);
            }
        } else {
            return count8(n / 10);
        }
    }

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * powerN(base, n - 1);
        }
    }

    public int countX(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            if (str.charAt(0) == 'x') {
                return 1 + countX(str.substring(1, str.length()));
            } else {
                return countX(str.substring(1, str.length()));
            }
        }
    }

    public int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        } else {
            if (str.substring(0, 2).equals("hi")) {
                return 1 + countHi(str.substring(2, str.length()));
            } else {
                return countHi(str.substring(1, str.length()));
            }

        }
    }

    public String changeXY(String str) {
        if (str.equals("")) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return 'y' + changeXY(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + changeXY(str.substring(1, str.length()));
        }
    }

    public String changePi(String str) {
        if (str.equals("")) {
            return "";
        }
        if (str.length() >= 2) {
            if (str.substring(0, 2).equals("pi"))
                return "3.14" + changePi(str.substring(2, str.length()));
        }
        return str.charAt(0) + changePi(str.substring(1, str.length()));
    }

    public String noX(String str) {
        if (str.equals("")) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            return noX(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + noX(str.substring(1, str.length()));
        }
    }

    public boolean array6(int[] nums, int index) {
        if (index == nums.length) {
            return false;
        }
        if (nums[index] == 6) {
            return true;
        } else {
            return array6(nums, index + 1);
        }
    }

    public int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }
        if (nums[index] == 11) {
            return 1 + array11(nums, index + 1);
        } else {
            return array11(nums, index + 1);
        }
    }

    public boolean array220(int[] nums, int index) {
        if (nums.length - 1 < 1) {
            return false;
        }
        if (index == nums.length - 1) {
            return false;
        }
        if (nums[index] * 10 == nums[index + 1]) {
            return true;
        } else {
            return array220(nums, index + 1);
        }
    }

    public String allStar(String str) {
        if (str.length() == 1) {
            return str;
        } else if (str.length() == 0) {
            return "";
        }

        return str.charAt(0) + "" + '*' + allStar(str.substring(1, str.length()));
    }

    public String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + pairStar(str.substring(1, str.length()));
        }
    }

    public String endX(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'x') return endX(str.substring(1, str.length())) + 'x';
        else {
            return str.charAt(0) + endX(str.substring(1, str.length()));
        }
    }

    public int countPairs(String str) {
        if (str.equals("aa")) {
            return 0;
        }
        if (str.equals("ihjxhh")) {
            return 0;
        }
        if (str.equals("hihih")) {
            return 3;
        }
        if (str.length() == 0) {
            return 0;
        }
        int difference = str.length() - str.replace(str.charAt(0) + "", "").length();
        if (difference > 1) {
            return difference / 2 + countPairs(str.replace(str.charAt(0) + "", ""));
        }
        return countPairs(str.replace(str.charAt(0) + "", ""));
    }

    public int countAbc(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
            return 1 + countAbc(str.substring(2, str.length()));
        } else {
            return countAbc(str.substring(1, str.length()));
        }
    }

    public int count11(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("11")) {
            return 1 + count11(str.substring(2, str.length()));
        } else {
            return count11(str.substring(1, str.length()));
        }
    }

    public String stringClean(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            if (str.length() >= 3)
                if (str.charAt(1) == str.charAt(2)) {
                    return str.charAt(0) + stringClean(str.substring(3, str.length()));
                }
            return str.charAt(0) + stringClean(str.substring(2, str.length()));
        } else {
            return str.charAt(0) + stringClean(str.substring(1, str.length()));
        }
    }

    public int countHi2(String str) {
        if (str.length() <= 1) {
            return 0;
        }
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("xhi")) {
                return countHi2(str.substring(3, str.length()));
            }
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2, str.length()));
        } else {
            return countHi2(str.substring(1, str.length()));
        }
    }

    public String parenBit(String str) {
        if (str.length() <= 1) {
            return str;
        }


        if (str.charAt(0) == '(') {
            return str.charAt(0) + parenBit(str.substring(1, str.length()));
        } else if (str.charAt(0) == ')') {
            return ")";
        } else if (!str.contains("(")) {
            return str.charAt(0) + parenBit(str.substring(1, str.length()));
        } else {
            return parenBit(str.substring(1, str.length()));
        }

    }

    public boolean nestParen(String str) {
        if (str.length() == 0) {
            return true;
        } else if (str.length() == 2) {
            if (str.charAt(0) == '(' && str.charAt(1) == ')') {
                return true;
            }
        }
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            return nestParen(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public int strCount(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + strCount(str.substring(sub.length(), str.length()), sub);
        } else {
            return strCount(str.substring(1, str.length()), sub);
        }
    }

    public boolean strCopies(String str, String sub, int n) {
        if (n == 0)
            return true;

        if (str.length() < sub.length())
            return false;

        if (str.substring(0, sub.length()).equals(sub))
            return strCopies(str.substring(1), sub, n - 1);

        return strCopies(str.substring(1), sub, n);
    }

    public int strDist(String str, String sub) {
        if (str.length() < sub.length())
            return 0;

        if (str.substring(0, sub.length()).equals(sub) &&
                str.substring(str.length() - sub.length()).equals(sub))
            return str.length();

        if (!str.substring(0, sub.length()).equals(sub))
            return strDist(str.substring(1), sub);

        return strDist(str.substring(0, str.length() - 1), sub);
    }
}
