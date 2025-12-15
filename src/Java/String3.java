package Java;

public class String3 {
    public int countYZ(String stb) {
        boolean theonebefore = false;
        String str = "";
        for (int i = 0; i < stb.length(); i++) {
            if (Character.isLetter(stb.charAt(i))) {
                str = str + stb.charAt(i);
            } else {
                if (theonebefore) {
                    str = str + " ";
                }
            }
            theonebefore = Character.isLetter(stb.charAt(i));
        }


        String[] a = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            char x = a[i].charAt(a[i].length() - 1);
            count = (x == 'y' || x == 'z' || x == 'Y' || x == 'Z') ? count + 1 : count;
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        // String other = "";
        // for(int i = remove.length; i<base.length ; i++){
        //   if (base.substring(i-remove.length,i) == remove){

        //   }
        // }
        return base.replace(remove.toUpperCase(), "").replace(remove.toLowerCase(), "").replace(remove, "");
    }

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        if (str.length() < 2) {
            return true;
        }
        if (str.substring(str.length() - 2, str.length()).equals("is")) {
            countIs++;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("is")) {
                countIs++;
            }

            if (str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }
        return (countIs == countNot);
    }

    public boolean gHappy(String str) {
        if (!str.contains("g")) {
            return true;
        }
        if (str.equals("g")) {
            return false;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'g') {
                if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
                    return false;
                }
            } else if (i + 1 == str.length() - 1) {
                return !(str.charAt(i + 1) == 'g');
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;
        if (str.length() < 3) {
            return count;
        }
        for (int i = 1; i < str.length() - 1; i++) {
            char x = str.charAt(i);
            if (str.charAt(i - 1) == x && str.charAt(i + 1) == x) {
                count++;
            }
        }
        return count;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += (Character.isDigit(str.charAt(i))) ? Integer.parseInt((str.charAt(i) + "")) : 0;
        }
        return sum;
    }

    public String sameEnds(String string) {
        if (string.substring(0, string.length() / 2).equals(string.substring(string.length() / 2, string.length()))) {
            return string.substring(0, string.length() / 2);
        }
        for (int first = 1, last = string.length() - 1; first < string.length() + 1 / 2; first++, last--) {
            if (string.substring(0, first).equals(string.substring(last, string.length()))) {
                return string.substring(0, first);
            }
        }
        return "";

    }

    public String mirrorEnds(String string) {
        int first = 0;
        for (int last = string.length() - 1; first < string.length() && string.charAt(first) == string.charAt(last); first++, last--)
            ;
        return string.substring(0, first);
    }

    public int maxBlock(String str) {
        if (str.length() == 0) return 0;
        char current = str.charAt(0);
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == current) {
                count++;
            } else {
                current = str.charAt(i);
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public int sumNumbers(String str) {
        if (str.length() == 0) return 0;
        String current = "";
        int sum = 0;
        boolean beforeIsDigit = false;
        for (int i = 0; i < str.length(); i++) {
            if (beforeIsDigit) {
                if (Character.isDigit(str.charAt(i))) {
                    current += str.charAt(i) + "";
                } else {
                    sum += Integer.parseInt(current);
                }
            } else {
                current = Character.isDigit(str.charAt(i)) ? str.charAt(i) + "" : "";
            }
            beforeIsDigit = Character.isDigit(str.charAt(i));
        }
        sum += (beforeIsDigit) ? Integer.parseInt(current) : 0;
        return sum;
    }

    public String notReplace(String str) {
        if (str.equals("is"))
            return "is not";

        StringBuilder result = new StringBuilder();
        int i = 0;

        if (str.length() >= 3 && str.substring(0, 2).equals("is") &&
                !Character.isLetter(str.charAt(2))) {
            result.append("is not");
            i = 2;
        }

        while (i < str.length()) {
            if (!Character.isLetter(str.charAt(i))) {
                result.append(str.charAt(i));
                i++;
            } else if (i >= 1 && i <= str.length() - 3 &&
                    !Character.isLetter(str.charAt(i - 1)) &&
                    str.substring(i, i + 2).equals("is") &&
                    !Character.isLetter(str.charAt(i + 2))) {
                result.append("is not");
                i += 2;
            } else if (i >= 1 && !Character.isLetter(str.charAt(i - 1)) &&
                    str.substring(i).equals("is")) {
                result.append("is not");
                i += 2;
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
}
