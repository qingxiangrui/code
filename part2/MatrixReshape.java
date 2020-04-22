package part2;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int oldRow = nums.length;
        int oldCol = nums[0].length;
        int[][] newMatrix = new int[r][c];

        if (oldRow * oldCol != r * c) return nums;

        //旧矩阵的坐标
        int oldI = 0;
        int oldJ = 0;
        for (int i = 0; i < r; i++) {
            //新矩阵的第i行
            for (int j = 0; j < c; j++) {
                newMatrix[i][j] = nums[oldI][oldJ];
                oldJ++;

                if (oldJ == oldCol) {
                    oldI++;
                    oldJ = 0;
                }
            }
        }
        return newMatrix;
    }
}
