Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

int n = events.length;
int[] maxValue = new int[n];
maxValue[0] = events[0][2];

// Populate maxValue with the maximum value till each event
for (int i = 1; i < n; i++) {
    maxValue[i] = Math.max(maxValue[i - 1], events[i][2]);
}

int maxSum = 0;

// Iterate through events
for (int i = 0; i < n; i++) {
    int[] currentEvent = events[i];

    // Find the last non-overlapping event
    int left = 0, right = i - 1, bestIdx = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (events[mid][1] < currentEvent[0]) {
            bestIdx = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    // Calculate the maximum sum including the current event
    int currentSum = currentEvent[2];
    if (bestIdx != -1) {
        currentSum += maxValue[bestIdx];
    }

    maxSum = Math.max(maxSum, currentSum);
}

return maxSum;
}