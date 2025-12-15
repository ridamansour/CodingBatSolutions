import java.util.List;

public class Functional2 {
    public List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> (n >= 13 && n <= 19));
        return nums;
    }

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() >= 4);
        return strings;
    }

    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }

    public List<String> noYY(List<String> strings) {
        if (strings.size() == 1) {
            if (strings.get(0).equals("")) {
                strings.replaceAll(n -> n + 'y');
                return strings;
            }
        }
        strings.removeIf(n -> n.charAt(n.length() - 1) == 'y' || n.contains("yy"));
        strings.replaceAll(n -> n + 'y');
        return strings;
    }

    public List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> (n * n) + 10);
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }

}
