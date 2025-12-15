package Java;

public class Warmup1 {

    /**
     * Title: sleepIn
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday, or we're on vacation. Return true if we sleep in.
     * <p>
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        return !aSmile && !bSmile;
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        return ((a < 0 && b > 0) || (a > 0 && b < 0));
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());

        return front + back;
    }

    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }

    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        String hi = str.substring(0, 2);
        return hi.equals("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));

    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);

    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String two = str.substring(1, 3);

        return two.equals("ix");
    }

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    public int intMax(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c) {
            max = a;
        }
        if (b >= a && b >= c) {
            max = b;
        }
        if (c >= a && c >= b) {
            max = c;
        }
        return max;
    }

    public int close10(int a, int b) {
        int aBoo = Math.abs(a - 10);
        int bBoo = Math.abs(b - 10);
        if (aBoo < bBoo) {
            return a;
        }
        if (bBoo < aBoo) {
            return b;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        return a >= 40 && a <= 50 && b >= 40 && b <= 50;
    }

    public boolean stringE(String str) {
        int length = str.length();
        int count = 0;
        int x = 0, y = 1;
        String d;
        while (length > 0) {
            d = str.substring(x, y);
            if (d.equals("e")) {
                count++;
            }

            x++;
            y++;
            length--;
        }
        return count >= 1 && count <= 3;
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + n) {
            result += str.charAt(i);
        }
        return result;
    }


}
