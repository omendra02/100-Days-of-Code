package Day3;
import java.util.Arrays;

class longestCommonPrefix {
    public String longestCommonPrefix1(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        longestCommonPrefix lcp = new longestCommonPrefix();
        String result = lcp.longestCommonPrefix1(strings);
        System.out.println("Longest common prefix: " + result);
    }
}
