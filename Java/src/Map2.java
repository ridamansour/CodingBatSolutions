import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i].charAt(0) + "", "" + strings[i].charAt(strings[i].length() - 1));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].charAt(0) + "")) {
                map.put(strings[i].charAt(0) + "", map.get(strings[i].charAt(0) + "") + strings[i]);
            } else {
                map.put(strings[i].charAt(0) + "", strings[i]);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String str = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }

            if (map.get(strings[i]) == 2) {
                str += strings[i];
                map.remove(strings[i]);
            }
        }
        return str;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Boolean> boolMap = new HashMap<String, Boolean>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
            boolMap.put(strings[i], map.get(strings[i]) >= 2);
        }
        return boolMap;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            String key = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {

            String key = String.valueOf(strings[i].charAt(0));

            if (map.containsKey(key)) {

                int val = map.get(key);
                if (val == -1) {
                    continue;
                }
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}
