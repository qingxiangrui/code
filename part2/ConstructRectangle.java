package part2;

public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int start = (int)Math.ceil(Math.sqrt(area));
        for (int i = start; i <= area ; i++) {
            if (area % i == 0) {
                return new int[]{i,area / i};
            }
        }
        return null;
    }

}
