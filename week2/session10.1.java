import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            deque.addLast(a[i]);
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

            if (deque.size() > k) {
                int x = deque.removeFirst();
                map.put(x, map.get(x) - 1);
                if (map.get(x) == 0) map.remove(x);
            }

            max = Math.max(max, map.size());
        }

        System.out.println(max);
    }
}