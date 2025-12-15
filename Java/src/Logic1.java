public class Logic1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars > 60 && isWeekend) return true;
        return cigars > 39 && cigars < 61;
    }

    public int dateFashion(int you, int date) {
        if (you > 7 && date > 2 || you > 2 && date > 7) return 2;
        if (you < 3 || date < 3) return 0;
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (temp > 59 && temp < 101 && isSummer) return true;
        return temp > 59 && temp < 91;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        speed = isBirthday ? speed - 5 : speed;
        if (speed > 80) return 2;
        if (speed < 61) return 0;
        return 1;
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        return sum > 9 && sum < 20 ? 20 : sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if (day > 0 && day < 6 && !vacation) return "7:00";
        if (day < 1 && !vacation || day > 5 && !vacation || day > 0 && day < 6 && vacation) return "10:00";
        return "off";
    }

    public boolean love6(int a, int b) {

        if (a == 6 || b == 6) return true;
        return a + b == 6 || Math.abs(a - b) == 6;
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode && n > 0 && n < 11) return true;
        return outsideMode && n < 2 || outsideMode && n > 9;
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || (n - 1) % 11 == 0;
    }

    public boolean more20(int n) {
        return (n - 1) % 20 == 0 || (n - 2) % 20 == 0;
    }

    public boolean old35(int n) {
        return n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0;
    }

    public boolean less20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0;
    }

    public boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }

    public int teenSum(int a, int b) {
        return (a > 12 && a < 20 || b > 12 && b < 20) ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && !isMorning || !isAsleep && isMom;
    }

    public int teaParty(int tea, int candy) {
        if (tea > 4 && candy > 4 && tea >= (2 * candy)) return 2;
        if (tea > 4 && candy > 4 && candy >= (2 * tea)) return 2;
        if (tea < 5 || candy < 5) return 0;
        return 1;
    }

    public String fizzString(String str) {
        String out = "";
        if (str.startsWith("f")) out = out + "Fizz";
        if (str.endsWith("b")) out = out + "Buzz";
        return out.equals("") ? str : out;
    }

    public String fizzString2(int n) {
        String out = "";
        if (n % 3 == 0) out = out + "Fizz";
        if (n % 5 == 0) out = out + "Buzz";
        return out.equals("") ? n + "!" : out + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return b > a && c > b || bOk && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return b > a && c > b || b >= a && c >= b && equalOk;
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) > 9 || Math.abs(a - c) > 9 || Math.abs(b - c) > 9;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (sum == 12 && noDoubles) return 7;
        if (die1 == die2 && noDoubles) return sum + 1;
        return sum;
    }

    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        int[] nums = a > b ? new int[]{a, b} : new int[]{b, a};
        if (a % 5 == b % 5) return nums[1];
        return nums[0];
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && b == c && c == a) return 5;
        if (a != b && a != c) return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c && c == a) return 20;
        if (a == b || b == c || c == a) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab - bc == 10 || ab - ac == 10) return 5;
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a % 10 == b % 10 || a / 10 == b % 10) || (a % 10 == b / 10 || a / 10 == b / 10);
    }

    public int sumLimit(int a, int b) {
        int ab = a + b;
        int alen = String.valueOf(a).length();
        int ablen = String.valueOf(ab).length();
        return alen == ablen ? ab : a;
    }
}
