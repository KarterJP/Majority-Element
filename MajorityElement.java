import java.util.*;
import java.io.*;

public class MajorityElement {
    private static boolean getMajorityElement(int[] a) {
        int left = 0, right = a.length-1;
        Arrays.sort(a);

        int mid = left + ((right - left) / 2);
        if (right % 2 == 1) {
            mid += 1;
        }

        while (mid <= right) {
            if (a[left] == a[mid]) {
                return true;
            } else {
                left++;
                mid++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(getMajorityElement(a) ? 1 : 0);
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}