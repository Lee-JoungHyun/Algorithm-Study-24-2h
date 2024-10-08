import java.util.*;
import java.io.*;

public class BOJ_12919 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        System.out.println(dfs(b, a));
    }

    static int dfs(String cur, String target) {
        if (cur.length() == target.length()) {
            if (cur.equals(target)) {
                return 1;
            }

            return 0;
        }

        int ret = 0;
        if(cur.charAt(0) == 'B') {
            ret += dfs(new StringBuilder(cur.substring(1)).reverse().toString(), target);
        }
        if(cur.charAt(cur.length() - 1) == 'A'){
            ret += dfs(cur.substring(0, cur.length() - 1), target);
        }
        return ret > 0 ? 1 : 0;
    }
}
