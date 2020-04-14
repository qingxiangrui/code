package part2;

public class KthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n - 1][n - 1];

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = getCountLtMid(matrix,mid);

            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int getCountLtMid(int[][] matrix, int mid) {
        int count = 0;
        int n = matrix.length;

        for (int i = n - 1; i >= 0; i--) {
            if (matrix[0][i] > mid) {
                continue;
            }

            for (int j = 0; j < n; j++) {
                if (matrix[j][i] > mid) {
                    count += j;
                    break;
                }
                if (j == n - 1) {
                    count += j;
                }
            }
        }

        return count;
    }
}