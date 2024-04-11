package Day5561;

import java.util.Arrays;

public class TwoBestNonOverlappingEvents {
    public int maxTwoEvents(int[][] events) {
        
            Arrays.sort(events, (a, b) -> a[0] - b[0]);
            int[] max = new int[events.length];
            for (int i = events.length - 1; i >= 0; i--) {
                if (i == events.length - 1) {
                    max[i] = events[i][2];
                } else {
                    max[i] = Math.max(events[i][2], max[i + 1]);
                }
            }
            int ans = 0;
            for (int i = 0; i < events.length; i++) {
                int end = events[i][1];
                int left = i + 1;
                int right = events.length;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (events[mid][0] <= end) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                int value = events[i][2];
                if (right >= 0 && right < events.length) {
                    value += max[right];
                }
                ans = Math.max(ans, value);
            }
            return ans;
        }
}
