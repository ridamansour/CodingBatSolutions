public class String2 {
    public String doubleChar(String str) {
        String end = "";
        for (int i = 0; i < str.length(); i++) {
            end = end + str.charAt(i) + str.charAt(i);
        }
        return end;
    }

    public int countHi(String str) {
        if (str.equals("hi")) {
            return 1;
        }
        if (str.length() < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        if (str.length() < 3) {
            return true;
        }
        boolean cat = false;
        boolean dog = false;
        boolean res;
        int a = 0, b = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat = true;
                a++;
            }

            if (str.substring(i, i + 3).equals("dog")) {
                dog = true;
                b++;
            }
        }

        res = cat && dog && a == b;

        return res;
    }

    public int countCode(String str) {
        if (str.length() < 4) {
            return 0;
        }
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }

        return count;
    }

    public boolean endOther(String str1, String str2) {
        String a = str1.toLowerCase();
        String b = str2.toLowerCase();
        if (a.length() > b.length()) {
            if (a.substring(a.length() - b.length(), a.length()).equals(b)) {
                return true;
            }
        }
        if (a.length() < b.length()) {
            if (b.substring(b.length() - a.length(), b.length()).equals(a)) {
                return true;
            }
        }
        return a.equals(b);
    }

    public boolean xyzThere(String str) {
        if (str.length() >= 4) {
            if (str.substring(0, 3).equals("xyz")) return true;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i - 1, i + 2).equals("xyz")) {
                if (i > 2) {
                    if (str.charAt(i - 2) != '.') {
                        return true;
                    }
                }
            } else if (str.length() < 4) {
                return true;
            }
        }
        return str.equals("xyz");
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int index = str.lastIndexOf("x");
        if (index < 0) return true;
        for (int i = index; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("y")) return true;
        }
        return false;
    }

    public String mixString(String a, String b) {
        String out = "";
        int len = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < len; i++) {
            out = out + a.substring(i, i + 1) + b.substring(i, i + 1);
        }
        if (a.length() > len) out = out + a.substring(len);
        if (b.length() > len) out = out + b.substring(len);
        return out;
    }

    public String repeatEnd(String str, int n) {
        String st = str.substring(str.length() - n, str.length());
        String stg = "";
        for (int i = 0; i < n; i++) {
            stg += st;
        }
        return stg;
    }

    public String repeatFront(String str, int n) {
        int r = n;
        String stg = "";
        for (int i = 0; i < n; i++) {
            stg += str.substring(0, r--);
        }
        return stg;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String r = sep + word;
        String fin = word;

        if (count == 0) {
            return "";
        }

        for (int i = 0; i < count - 1; i++) {
            fin += r;
        }
        return fin;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = 1; i < str.length() + 1 - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) return true;
        }
        return false;
    }

    public boolean xyzMiddle(String str) {
        int len = str.length();
        int mid = str.length() / 2;
        if (len == 3 && str.equals("xyz")) return true;
        if (len > 3 && len % 2 == 0) {
            if (str.substring(mid - 2, mid + 1).equals("xyz")) return true;
            if (str.substring(mid - 1, mid + 2).equals("xyz")) return true;
        }
        if (len > 3 && len % 2 != 0) {
            return str.substring(mid - 1, mid + 2).equals("xyz");
        }
        return false;
    }

    public String getSandwich(String str) {
        String out = "";
        if (str.length() > 10 && str.indexOf("bread") != str.lastIndexOf("bread")) {
            int start = str.indexOf("bread");
            int finish = str.lastIndexOf("bread");
            out = out + str.substring(start + 5, finish);
        }
        return out;
    }

    public boolean sameStarChar(String str) {
        if (str.length() < 3) {
            return str.equals("*") || str.equals("") || str.equals("**");

        } else {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i + 1) == '*') {
                    if (!(str.charAt(i) == str.charAt(i + 2))) {
                        return false;
                    }

                }
            }
        }
        return true;

    }

    public String oneTwo(String str) {
        String x = "";
        for (int i = 0; i <= str.length() - 3; i += 3) {
            x = x + str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return x;
    }

    public String zipZap(String str) {
        String x = "";
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                x += "zp";
                i += 2;
            } else {
                x += str.charAt(i);
            }
        }
        return x;
    }

    public String starOut(String str) {
        if (str.length() < 1)
            return "";

        if (str.length() == 1) {
            if (str.charAt(0) == '*')
                return "";
            else
                return str;
        }

        char[] arr = new char[str.length()];
        int count = 0;


        if (str.charAt(0) != '*' && str.charAt(1) != '*') {
            arr[count] = str.charAt(0);
            count++;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) != '*' && str.charAt(i) != '*' &&
                    str.charAt(i + 1) != '*') {
                arr[count] = str.charAt(i);
                count++;
            }
        }

        if (str.charAt(str.length() - 1) != '*' &&
                str.charAt(str.length() - 2) != '*') {
            arr[count] = str.charAt(str.length() - 1);
            count++;
        }

        return new String(arr, 0, count);
    }

    public String plusOut(String str, String word) {
        StringBuffer result = new StringBuffer();
        int i = 0;

        while (i < str.length()) {
            if (i <= str.length() - word.length() &&
                    str.substring(i, i + word.length()).equals(word)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }

        return result.toString();
    }

    public String wordEnds(String str, String word) {
        StringBuffer result = new StringBuffer();
        int i = 0;

        if (str.length() >= word.length() + 1 &&
                str.substring(0, word.length()).equals(word)) {
            i = word.length() - 1;
            result.append(str.charAt(i + 1));
        }

        while (i < str.length() - word.length()) {
            if (str.substring(i + 1, i + 1 + word.length()).equals(word)) {
                result.append(str.charAt(i));
                i = i + word.length();
                if (i < str.length() - 1) {
                    result.append(str.charAt(i + 1));
                }
            } else {
                i++;
            }
        }

        return result.toString();
    }

}
