public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return ("<" + tag + ">") + word + ("</" + tag + ">");
    }

    public String makeOutWord(String out, String word) {
        String a = out.substring(0, 2);
        String b = out.substring(2, 4);
        return a + word + b;
    }

    public String extraEnd(String str) {
        String a = (str.substring(str.length() - 2, str.length()));
        return a + a + a;
    }

    public String firstTwo(String str) {
        if (str.length() < 2)
            return str;
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        int thing = str.length() / 2;
        return str.substring(0, thing);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (b.length() < a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        return a + b + a;
    }

    public String nonStart(String a, String b) {

        if (a.length() < 2 && b.length() >= 2) return b.substring(1, b.length());
        if (b.length() < 2 && a.length() >= 2) return a.substring(1, a.length());

        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        String o = "";
        if (front)
            o = str.substring(0, 1);
        if (!front) {
            o = str.substring(str.length() - 1, str.length());
        }
        return o;

    }

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int a = str.length() / 2;
        return str.substring(a - 1, a + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        return str.substring(str.length() - 2, str.length()).equals("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        int a = 2 + index;
        int b = index;

        if (a > str.length() || b < 0)
            return str.substring(0, 2);

        return str.substring(b, a);
    }

    public String middleThree(String str) {
        int x = str.length() / 2;
        return str.substring(x - 1, x + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() == 3)
            return str.substring(0, 3).equals("bad");

        if (str.length() >= 4)
            return str.substring(0, 3).equals("bad") ||
                    str.substring(1, 4).equals("bad");

        return false;
    }

    public String atFirst(String str) {
        if (str.length() < 1) return "@@";
        if (str.length() < 2) return str + "@";

        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        String a1 = a;
        String b1 = b;

        if (a1.length() < 1)
            a1 = "@";
        if (b.length() < 1)
            b1 = "@";
        return a1.substring(0, 1) + b1.substring(b1.length() - 1, b1.length());
    }

    public String conCat(String a, String b) {
        if (a.length() < 1) return b;
        if (b.length() < 1) return a;
        if (a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1)))
            return a + b.substring(1, b.length());
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) return str;

        String a = str.substring(0, str.length() - 2);
        String b = str.substring(str.length() - 1, str.length());
        String c = str.substring(str.length() - 2, str.length() - 1);
        return a + b + c;
    }

    public String seeColor(String str) {

        if (str.equals("red"))
            return "red";

        if (str.length() <= 3)
            return "";
        if (str.substring(0, 3).equals("red"))
            return "red";

        if (str.substring(0, 4).equals("blue"))
            return "blue";

        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        return str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()));
    }

    public String minCat(String a, String b) {
        int min = Math.min(a.length(), b.length());

        return a.substring(a.length() - min) + b.substring(b.length() - min);
    }

    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String n = str.substring(0, 2);
        return n + n + n;
    }

    public String without2(String str) {
        if (str.length() >= 2 &&
                str.substring(0, 2).equals(str.substring(str.length() - 2)))
            return str.substring(2);

        return str;
    }

    public String deFront(String str) {
        if (str.length() == 1 && str.charAt(0) != 'a')
            return "";

        if (str.length() >= 2) {
            if (str.charAt(0) != 'a' && str.charAt(1) != 'b') {
                return str.substring(2);
            } else if (str.charAt(0) != 'a') {
                return str.substring(1);
            } else if (str.charAt(1) != 'b') {
                return "a" + str.substring(2);
            }
        }

        return str;
    }

    public String startWord(String str, String word) {
        if (str.length() >= word.length() &&
                str.substring(1, word.length()).equals(word.substring(1)))
            return str.substring(0, word.length());

        return "";
    }

    public String withoutX(String str) {
        int begin = 0;
        int end = str.length();

        if (str.length() > 0 && str.charAt(0) == 'x')
            begin = 1;

        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x')
            end--;

        return str.substring(begin, end);
    }

    public String withoutX2(String str) {
        if (str.length() == 1 && str.charAt(0) == 'x')
            return "";

        if (str.length() >= 2) {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        }

        return str;
    }


}
