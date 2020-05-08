class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        float slope = slope(coordinates[0], coordinates[1]);
        for (int i = 2; i < coordinates.length; i++) {
            if (slope(coordinates[0], coordinates[i]) != slope) {
                return false;
            }
        }
        return true;
    }
    
    private float slope(int[] p1, int[] p2) {
        return (float)(p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
}
