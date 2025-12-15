package Java;

public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        if (goal > small + big * 5) return false;
        return goal % 5 <= small;
    }

    public int loneSum(int a, int b, int c) {
        int out = 0;
        if (a != b && a != c) out = out + a;
        if (b != a && b != c) out = out + b;
        if (c != a && c != b) out = out + c;
        return out;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private int fixTeen(int n) {
        return n > 12 && n < 15 || n > 16 && n < 20 ? 0 : n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private int round10(int num) {
        return num % 10 < 5 ? num - num % 10 : num + (10 - num % 10);
    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(b - a) < 2 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) return true;
        return Math.abs(c - a) < 2 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1;
    }

    public int blackjack(int a, int b) {
        int out = 0;
        if (a > b && a < 22 || a < 22 && b > 21) out = a;
        if (b > a && b < 22 || b < 22 && a > 21) out = b;
        return out;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int mid = Math.max(Math.min(a, b), c);
        int mid2 = Math.min(Math.max(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        return Math.abs(mid - min) == Math.abs(mid - max) || Math.abs(mid2 - min) == Math.abs(mid2 - max);
    }

    public int makeChocolate(int small, int big, int goal) {
        if (goal > small + big * 5) return -1;
        if (goal % 5 > small) return -1;
        return goal / 5 >= big ? goal - big * 5 : goal % 5;
    }

}
