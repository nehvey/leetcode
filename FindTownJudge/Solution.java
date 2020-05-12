class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustCount = new int[N + 1];
        for (int[] t: trust) {
            int truster = t[0];
            int trustee = t[1];
            trustCount[truster]--;
            trustCount[trustee]++;
        }
        for (int i = 1; i <= N; i++) {
            if (trustCount[i] == N - 1) {
                return i;
            }
        }
        return -1;       
    }
}
